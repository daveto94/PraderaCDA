/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.praderacda.view;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        documentocliente = new javax.swing.JTextField();
        nombre_apellidocliente = new javax.swing.JTextField();
        tipo_vehiculocliente = new javax.swing.JTextField();
        placacliente = new javax.swing.JTextField();
        modelocliente = new javax.swing.JTextField();
        fechacliente = new javax.swing.JTextField();
        horacliente = new javax.swing.JTextField();
        botonagregar = new javax.swing.JButton();
        botonactualizar = new javax.swing.JButton();
        telefonocliente = new javax.swing.JTextField();
        consulta_cedulacliente1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        botonbuscar = new javax.swing.JButton();
        botoncancelacion = new javax.swing.JButton();
        limpiarcliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Pradera CDA");

        jTabbedPane4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Documento:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nombre y apellido:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Placa:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Modelo:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Fecha:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Hora:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Tipo de vehiculo:");

        documentocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoclienteActionPerformed(evt);
            }
        });

        nombre_apellidocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_apellidoclienteActionPerformed(evt);
            }
        });

        tipo_vehiculocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_vehiculoclienteActionPerformed(evt);
            }
        });

        placacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaclienteActionPerformed(evt);
            }
        });

        modelocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloclienteActionPerformed(evt);
            }
        });

        fechacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaclienteActionPerformed(evt);
            }
        });

        horacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaclienteActionPerformed(evt);
            }
        });

        botonagregar.setText("Agendar");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        botonactualizar.setText("Actualizar");

        telefonocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoclienteActionPerformed(evt);
            }
        });

        consulta_cedulacliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_cedulacliente1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Cedula a buscar:");

        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        botoncancelacion.setText("Cancelar agendamiento");

        limpiarcliente.setText("Limpiar");
        limpiarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(consulta_cedulacliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(botonbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botoncancelacion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(nombre_apellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_vehiculocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(fechacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botonagregar)
                                .addGap(31, 31, 31)
                                .addComponent(botonactualizar)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(horacliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(documentocliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(placacliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(modelocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(telefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpiarcliente)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulta_cedulacliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar)
                    .addComponent(botoncancelacion))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_apellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(documentocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modelocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipo_vehiculocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(placacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horacliente)
                    .addComponent(fechacliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonactualizar)
                    .addComponent(botonagregar)
                    .addComponent(limpiarcliente))
                .addGap(63, 63, 63))
        );

        jTabbedPane4.addTab("Consulta y agendamiento", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonagregarActionPerformed

    private void horaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaclienteActionPerformed

    private void fechaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaclienteActionPerformed

    private void modeloclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloclienteActionPerformed

    private void placaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaclienteActionPerformed

    private void telefonoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoclienteActionPerformed

    private void tipo_vehiculoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_vehiculoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_vehiculoclienteActionPerformed

    private void nombre_apellidoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_apellidoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_apellidoclienteActionPerformed

    private void documentoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoclienteActionPerformed

    private void consulta_cedulacliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_cedulacliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consulta_cedulacliente1ActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void limpiarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarclienteActionPerformed

    public JButton getBotonactualizar() {
        return botonactualizar;
    }

    public void setBotonactualizar(JButton botonactualizar) {
        this.botonactualizar = botonactualizar;
    }

    public JButton getBotonagregar() {
        return botonagregar;
    }

    public void setBotonagregar(JButton botonagregar) {
        this.botonagregar = botonagregar;
    }

    public JButton getBotonbuscar() {
        return botonbuscar;
    }

    public void setBotonbuscar(JButton botonbuscar) {
        this.botonbuscar = botonbuscar;
    }

    public JButton getBotoncancelacion() {
        return botoncancelacion;
    }

    public void setBotoncancelacion(JButton botoncancelacion) {
        this.botoncancelacion = botoncancelacion;
    }

    public JTextField getConsulta_cedulacliente1() {
        return consulta_cedulacliente1;
    }

    public void setConsulta_cedulacliente1(JTextField consulta_cedulacliente1) {
        this.consulta_cedulacliente1 = consulta_cedulacliente1;
    }

    public JTextField getDocumentocliente() {
        return documentocliente;
    }

    public void setDocumentocliente(JTextField documentocliente) {
        this.documentocliente = documentocliente;
    }

    public JTextField getFechacliente() {
        return fechacliente;
    }

    public void setFechacliente(JTextField fechacliente) {
        this.fechacliente = fechacliente;
    }

    public JTextField getHoracliente() {
        return horacliente;
    }

    public void setHoracliente(JTextField horacliente) {
        this.horacliente = horacliente;
    }

    public JTextField getModelocliente() {
        return modelocliente;
    }

    public void setModelocliente(JTextField modelocliente) {
        this.modelocliente = modelocliente;
    }

    public JTextField getNombre_apellidocliente() {
        return nombre_apellidocliente;
    }

    public void setNombre_apellidocliente(JTextField nombre_apellidocliente) {
        this.nombre_apellidocliente = nombre_apellidocliente;
    }

    public JTextField getPlacacliente() {
        return placacliente;
    }

    public void setPlacacliente(JTextField placacliente) {
        this.placacliente = placacliente;
    }

    public JTextField getTelefonocliente() {
        return telefonocliente;
    }

    public void setTelefonocliente(JTextField telefonocliente) {
        this.telefonocliente = telefonocliente;
    }

    public JTextField getTipo_vehiculocliente() {
        return tipo_vehiculocliente;
    }

    public void setTipo_vehiculocliente(JTextField tipo_vehiculocliente) {
        this.tipo_vehiculocliente = tipo_vehiculocliente;
    }

    public JButton getLimpiarcliente() {
        return limpiarcliente;
    }

    public void setLimpiarcliente(JButton limpiarcliente) {
        this.limpiarcliente = limpiarcliente;
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonactualizar;
    private javax.swing.JButton botonagregar;
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botoncancelacion;
    public javax.swing.JTextField consulta_cedulacliente1;
    public javax.swing.JTextField documentocliente;
    public javax.swing.JTextField fechacliente;
    public javax.swing.JTextField horacliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton limpiarcliente;
    public javax.swing.JTextField modelocliente;
    public javax.swing.JTextField nombre_apellidocliente;
    public javax.swing.JTextField placacliente;
    public javax.swing.JTextField telefonocliente;
    public javax.swing.JTextField tipo_vehiculocliente;
    // End of variables declaration//GEN-END:variables

    public void setHoracliente(String jsonGET) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDocumentocliente(String hola) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}