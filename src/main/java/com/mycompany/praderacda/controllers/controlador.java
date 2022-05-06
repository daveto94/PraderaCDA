/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praderacda.controllers;


import com.mycompany.praderacda.view.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class controlador implements ActionListener{
    vista vis;
    
                                    // se crea la solicitud GET
    
   
    public controlador(){
        this.vis = new vista();
    }
    public void iniciar(){
        vis.getBotonactualizar().addActionListener(this);
        vis.getBotonagregar().addActionListener(this);
        vis.getBotonbuscar().addActionListener(this);
        vis.getBotoncancelacion().addActionListener(this);
        vis.getLimpiarcliente().addActionListener(this);
        vis.setLocationRelativeTo(null);
        vis.setVisible(true);  
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource().equals(vis.getBotonbuscar())){
                
           try {
               String documento = vis.getConsulta_cedulacliente1().getText();
               HttpClient client = HttpClient.newHttpClient();
               HttpRequest request = HttpRequest.newBuilder()                                  //Se crea la conexi�n
                       .uri(URI.create("http://localhost:8080/servicio/"+documento))
                       .build();
               HttpResponse<String> response = client.send(request,
                       HttpResponse.BodyHandlers.ofString());
                String jsonGET = response.body();
                System.out.println(jsonGET);
                String[] u = jsonGET.split(",");
                //System.out.println(response.statusCode());
                ArrayList<String> jnoList = new ArrayList<String>(Arrays.asList(u));
                
                for(int i=0; i<jnoList.size(); i++){
                    String[] a = jnoList.get(i).split("\":");
                    System.out.println(a[1]);
                    if(i==1){vis.documentocliente.setText(a[1]);}
                    if(i==2){vis.nombre_apellidocliente.setText(a[1]);}
                    if(i==3){vis.telefonocliente.setText(a[1]);}
                    if(i==4){vis.tipo_vehiculocliente.setText(a[1]);}
                    if(i==5){vis.placacliente.setText(a[1]);}
                    if(i==6){vis.modelocliente.setText(a[1]);}
                    if(i==7){
                        String[] b = a[1].split("T");
                        vis.fechacliente.setText(b[0]);
                    }
                    if(i==8){vis.horacliente.setText(a[1]);}
                } 
            } catch (IOException ex) {
               Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
               Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(ae.getSource().equals(vis.getLimpiarcliente())){
            vis.documentocliente.setText("");
            vis.nombre_apellidocliente.setText("");
            vis.telefonocliente.setText("");
            vis.tipo_vehiculocliente.setText("");
            vis.placacliente.setText("");
            vis.modelocliente.setText("");
            vis.fechacliente.setText("");
            vis.horacliente.setText("");
            vis.consulta_cedulacliente1.setText("");
            System.out.println("clean");
        }
        if(ae.getSource().equals(vis.getBotonagregar())){
            String doc =    vis.getDocumentocliente().getText();
            String nom_ap = vis.getNombre_apellidocliente().getText();
            String tel =    vis.getTelefonocliente().getText();
            String tipo =   vis.getTipo_vehiculocliente().getText();
            String placa =  vis.getPlacacliente().getText();
            String modelo = vis.getModelocliente().getText();
            String fecha =  vis.getFechacliente().getText();
            String hora =   vis.getHoracliente().getText();
        }
       
       
       
    } 
}
