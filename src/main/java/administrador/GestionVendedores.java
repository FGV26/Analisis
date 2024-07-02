/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import datos.VendedorDAO;
import modelo.Vendedor;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionVendedores extends javax.swing.JFrame {

    /**
     * Creates new form GestionVendedores
     */
    public GestionVendedores() {
        initComponents();
        setLocationRelativeTo(null);
        actualizarTablaVendedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btonlogout = new javax.swing.JButton();
        btonCrear = new javax.swing.JButton();
        btonEditar = new javax.swing.JButton();
        btonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbleVendedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btonlogout1 = new javax.swing.JButton();

        btonlogout.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        btonlogout.setText("Volver a login");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btonCrear.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        btonCrear.setText("Crear");
        btonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonCrearActionPerformed(evt);
            }
        });

        btonEditar.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        btonEditar.setText("Editar");
        btonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonEditarActionPerformed(evt);
            }
        });

        btonEliminar.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        btonEliminar.setText("Eliminar");
        btonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonEliminarActionPerformed(evt);
            }
        });

        tbleVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Contacto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbleVendedores);

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Vendedores");

        btonlogout1.setFont(new java.awt.Font("NSimSun", 3, 14)); // NOI18N
        btonlogout1.setText("Volver");
        btonlogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonlogout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btonCrear)
                .addGap(49, 49, 49)
                .addComponent(btonEditar)
                .addGap(47, 47, 47)
                .addComponent(btonEliminar)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btonlogout1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btonEditar)
                    .addComponent(btonEliminar)
                    .addComponent(btonCrear))
                .addGap(18, 18, 18)
                .addComponent(btonlogout1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonCrearActionPerformed

        this.dispose();
        DatosVendedor datosVendedor = new DatosVendedor();
        datosVendedor.setVisible(true);
    }//GEN-LAST:event_btonCrearActionPerformed

    private void btonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonEditarActionPerformed

        int selectedRow = tbleVendedores.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un vendedor para editar.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tbleVendedores.getModel();
        int vendedorId = (int) model.getValueAt(selectedRow, 0);

        this.dispose();
        DatosVendedor datosVendedor = new DatosVendedor(vendedorId);
        datosVendedor.setVisible(true);
    }//GEN-LAST:event_btonEditarActionPerformed

    private void btonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonEliminarActionPerformed

        int selectedRow = tbleVendedores.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un vendedor para eliminar.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tbleVendedores.getModel();
        int vendedorId = (int) model.getValueAt(selectedRow, 0);

        int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este vendedor?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            VendedorDAO vendedorDAO = new VendedorDAO();
            vendedorDAO.eliminar(vendedorId);
            actualizarTablaVendedores();
        }
    }//GEN-LAST:event_btonEliminarActionPerformed

    private void btonlogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonlogout1ActionPerformed
        
        InterfazAdministrador iad = new InterfazAdministrador(); 
        iad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btonlogout1ActionPerformed

    public void actualizarTablaVendedores() {
        VendedorDAO vendedorDAO = new VendedorDAO();
        List<Vendedor> vendedores = vendedorDAO.seleccionarTodos();

        DefaultTableModel model = (DefaultTableModel) tbleVendedores.getModel();
        model.setRowCount(0);
        for (Vendedor vendedor : vendedores) {
            model.addRow(new Object[]{vendedor.getId(), vendedor.getNombre(), vendedor.getContacto()});
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
            java.util.logging.Logger.getLogger(GestionVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionVendedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btonCrear;
    private javax.swing.JButton btonEditar;
    private javax.swing.JButton btonEliminar;
    private javax.swing.JButton btonlogout;
    private javax.swing.JButton btonlogout1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbleVendedores;
    // End of variables declaration//GEN-END:variables
}
