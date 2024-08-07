/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import Interfaces.login;


/**
 *
 * @author ferna
 */
public class InterfazAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form InterfazAdministrador
     */
    public InterfazAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
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
        btonGestionVendedores = new javax.swing.JButton();
        btonMensajes = new javax.swing.JButton();
        btonVehiculos = new javax.swing.JButton();
        btonlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("INTERFAZ DE ADMINISTRADOR ");

        btonGestionVendedores.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btonGestionVendedores.setText("Gestion de Venderores");
        btonGestionVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonGestionVendedoresActionPerformed(evt);
            }
        });

        btonMensajes.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btonMensajes.setText("Mensajes");
        btonMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonMensajesActionPerformed(evt);
            }
        });

        btonVehiculos.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btonVehiculos.setText("Ver Stock Vehiculos");
        btonVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonVehiculosActionPerformed(evt);
            }
        });

        btonlogout.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        btonlogout.setText("Volver a login");
        btonlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btonMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(btonGestionVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(btonVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btonlogout)
                    .addComponent(jLabel1))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(btonGestionVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btonVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btonMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btonlogout)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btonGestionVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonGestionVendedoresActionPerformed
        
        this.dispose();
        new GestionVendedores().setVisible(true);
    }//GEN-LAST:event_btonGestionVendedoresActionPerformed

    private void btonMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonMensajesActionPerformed
        
        this.dispose();
        new ActualizarVehiculos().setVisible(true);
    }//GEN-LAST:event_btonMensajesActionPerformed

    private void btonVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonVehiculosActionPerformed
        
        this.dispose();
        new ActualizarVehiculos().setVisible(true);
        
    }//GEN-LAST:event_btonVehiculosActionPerformed

    private void btonlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonlogoutActionPerformed
        
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_btonlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btonGestionVendedores;
    private javax.swing.JButton btonMensajes;
    private javax.swing.JButton btonVehiculos;
    private javax.swing.JButton btonlogout;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
