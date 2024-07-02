/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import datos.UsuarioDAO;
import datos.VendedorDAO;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.Vendedor;

public class DatosVendedor extends javax.swing.JFrame {

    private int vendedorId;
    private boolean isEditMode;

    public DatosVendedor() {
        initComponents();
        setLocationRelativeTo(null);
        isEditMode = false;
    }

    public DatosVendedor(int vendedorId) {
        this.vendedorId = vendedorId;
        initComponents();
        setLocationRelativeTo(null);
        isEditMode = true;
        cargarDatos(vendedorId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btonCancelar = new javax.swing.JButton();
        btonComfirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtApellidoM.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        txtApellidoM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese apellido materno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 1, 12))); // NOI18N
        txtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese su nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 1, 12))); // NOI18N

        txtContacto.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        txtContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese su contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 1, 12))); // NOI18N

        txtApellidoP.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        txtApellidoP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese apellido paterno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 1, 12))); // NOI18N

        txtUser.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        txtUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese su user", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 1, 12))); // NOI18N

        txtContraseña.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese su contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("NSimSun", 1, 12))); // NOI18N

        btonCancelar.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        btonCancelar.setText("Cancelar");
        btonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonCancelarActionPerformed(evt);
            }
        });

        btonComfirmar.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        btonComfirmar.setText("Comfirmar");
        btonComfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonComfirmarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese los Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btonCancelar)
                        .addGap(185, 185, 185)
                        .addComponent(btonComfirmar)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonComfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMActionPerformed

    private void btonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonCancelarActionPerformed
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btonCancelarActionPerformed

    private void btonComfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonComfirmarActionPerformed

        String nombre = txtNombre.getText();
        String apellidoP = txtApellidoP.getText();
        String apellidoM = txtApellidoM.getText();
        String contacto = txtContacto.getText();
        String username = txtUser.getText();
        String password = txtContraseña.getText(); // No es necesario convertir

        if (nombre.isEmpty() || apellidoP.isEmpty() || apellidoM.isEmpty() || contacto.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.");
            return;
        }

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        VendedorDAO vendedorDAO = new VendedorDAO();

        if (vendedorId == 0) {
            // Crear un nuevo usuario y un nuevo vendedor
            Usuario usuarioExistente = usuarioDAO.seleccionarPorUsername(username);
            if (usuarioExistente != null) {
                JOptionPane.showMessageDialog(this, "El usuario ya existe.");
                return;
            }

            Usuario nuevoUsuario = new Usuario(username, password, "Vendedor");
            usuarioDAO.insertar(nuevoUsuario);
            Usuario usuarioCreado = usuarioDAO.seleccionarPorUsername(username);

            Vendedor nuevoVendedor = new Vendedor(nombre, apellidoP, apellidoM, contacto, usuarioCreado.getId());
            vendedorDAO.insertar(nuevoVendedor);

            JOptionPane.showMessageDialog(this, "Vendedor creado exitosamente.");
        } else {
            // Actualizar el vendedor y el usuario existente
            Vendedor vendedorExistente = vendedorDAO.seleccionar(vendedorId);
            if (vendedorExistente != null) {
                Usuario usuarioExistente = usuarioDAO.seleccionar(vendedorExistente.getIdUsuario());
                if (usuarioExistente != null) {
                    usuarioExistente.setUsername(username);
                    usuarioExistente.setPassword(password);
                    usuarioDAO.actualizar(usuarioExistente);

                    vendedorExistente.setNombre(nombre);
                    vendedorExistente.setApellidoPaterno(apellidoP);
                    vendedorExistente.setApellidoMaterno(apellidoM);
                    vendedorExistente.setContacto(contacto);
                    vendedorDAO.actualizar(vendedorExistente);

                    JOptionPane.showMessageDialog(this, "Vendedor actualizado exitosamente.");
                }
            }
        }
        this.dispose(); // Cierra la ventana actual
        GestionVendedores gv = new GestionVendedores();
        gv.actualizarTablaVendedores();
        gv.setVisible(true);
    }//GEN-LAST:event_btonComfirmarActionPerformed

    public void cargarDatos(int vendedorId) {
        VendedorDAO vendedorDAO = new VendedorDAO();
        Vendedor vendedor = vendedorDAO.seleccionar(vendedorId);
        if (vendedor != null) {
            txtNombre.setText(vendedor.getNombre());
            txtApellidoP.setText(vendedor.getApellidoPaterno());
            txtApellidoM.setText(vendedor.getApellidoMaterno());
            txtContacto.setText(vendedor.getContacto());

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = usuarioDAO.seleccionar(vendedor.getIdUsuario());
            if (usuario != null) {
                txtUser.setText(usuario.getUsername());
                txtContraseña.setText(usuario.getPassword());
            }
        }
    }

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
            java.util.logging.Logger.getLogger(DatosVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btonCancelar;
    private javax.swing.JButton btonComfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
