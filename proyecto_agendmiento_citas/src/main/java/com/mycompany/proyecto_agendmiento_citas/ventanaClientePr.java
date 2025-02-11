/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_agendmiento_citas;

import static com.mycompany.proyecto_agendmiento_citas.reservarCita.jcDia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Chapal
 */
public class ventanaClientePr extends javax.swing.JFrame {

    /**
     * Creates new form ventanaClientePr
     */
    public ventanaClientePr() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnReservarCita = new javax.swing.JToggleButton();
        btnVerCitaU = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("SERVICIOS");

        jLabel2.setText("BARBERIA");

        jLabel3.setText("PELUQUERIA");

        jLabel4.setText("LIMPIEZA FACIAL");

        jLabel5.setText("Desde cortes clasicos  ");

        jLabel6.setText("hasta los más modernos");

        jLabel7.setText("El afeitado clásico con navaja");

        jLabel8.setText("es una experiencia tradicional");

        jLabel9.setText("Diseñados para reducir los");

        jLabel10.setText("signos del envejecimiento");

        btnReservarCita.setText("RESERVAR");
        btnReservarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarCitaActionPerformed(evt);
            }
        });

        btnVerCitaU.setText("VER CITA");
        btnVerCitaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCitaUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(72, 72, 72))))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnReservarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerCitaU, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservarCita)
                    .addComponent(btnVerCitaU))
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarCitaActionPerformed
        // TODO add your handling code here:
        reservarCita verVentana = new reservarCita();
        String profesional = "";
        Connection conexion = conectar_bd.conectar();

        if (conexion != null) {
            try {
                String query = "SELECT * FROM barbero";
                PreparedStatement preparedStatement = conexion.prepareStatement(query);

                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    profesional = resultSet.getString("nombre");
                    verVentana.jcProfesional.addItem(profesional);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    conexion.close();

                } catch (SQLException e) {

                    e.printStackTrace();
                }
            }
        }

        LocalDate fechaActual = LocalDate.now();
        int diaDelMes = fechaActual.getDayOfMonth();
        verVentana.jcDia.removeAllItems();
        int cont = diaDelMes;
        while (cont <= 31) {

            verVentana.jcDia.addItem(String.valueOf(cont));
            cont += 1;
        }
        verVentana.setVisible(true);

    }//GEN-LAST:event_btnReservarCitaActionPerformed

    private void btnVerCitaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCitaUActionPerformed
        ventanaEditarCitaU verVentana = new ventanaEditarCitaU();

        Connection conexion = conectar_bd.conectar();

        if (conexion != null) {
            try {
                String query = "SELECT * FROM Cita WHERE idCliente=?";
                PreparedStatement preparedStatement = conexion.prepareStatement(query);
                loginCliente vn = new loginCliente();
                cliente clint = new cliente();
                int idC = clint.obtenerId(vn.nombreU);
                preparedStatement.setInt(1, idC);
                String cita = "";
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    cita = resultSet.getString("id");
                    verVentana.jcCitas.addItem(cita);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conexion != null) {
            try {
                String queryDos = "SELECT * FROM barbero";
                PreparedStatement preparedStatement = conexion.prepareStatement(queryDos);
                String profesional = "";
                ResultSet resultSetDos = preparedStatement.executeQuery();
                while (resultSetDos.next()) {
                    profesional = resultSetDos.getString("nombre");
                    verVentana.jcProfesiona.addItem(profesional);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    conexion.close();

                } catch (SQLException e) {

                    e.printStackTrace();
                }
            }
        }

        if (verVentana.jcCitas.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "EL USUARIO NO TIENE CITAS PROGRAMADAS");
        } else {
            verVentana.setVisible(true);
        }

    }//GEN-LAST:event_btnVerCitaUActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaClientePr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaClientePr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaClientePr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaClientePr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaClientePr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnReservarCita;
    private javax.swing.JToggleButton btnVerCitaU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
