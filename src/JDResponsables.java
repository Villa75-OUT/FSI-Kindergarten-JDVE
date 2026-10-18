
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author arso-opossum
 */
public class JDResponsables extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JDResponsables.class.getName());

    private Conexion cnx;
 
    public JDResponsables(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

     public void obtenerConexion (Conexion cnx){
        this.cnx = cnx;
    }
     
     public void obtenerResponsable(Responsables resp) {
        if (resp == null) return;
        TFCurp.setText(resp.curpr);
        TFnombre.setText(resp.nombrer);
        CBsexo.setSelectedItem(resp.sexor);
        TFTelefono.setText(resp.telefono);
        TFPArentesco.setText(resp.parentesco);
        TFestado.setSelectedItem(resp.estador);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BTRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFnombre = new javax.swing.JTextField();
        TFCurp = new javax.swing.JTextField();
        CBsexo = new javax.swing.JComboBox<>();
        TFestado = new javax.swing.JComboBox<>();
        TFTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFPArentesco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Borrar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setText("Nombre");

        BTRegistrar.setText("Registrar");
        BTRegistrar.addActionListener(this::BTRegistrarActionPerformed);

        jLabel2.setText("CURP");

        jButton3.setText("Editar");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jLabel3.setText("Sexo");

        jLabel4.setText("Telefono");

        jLabel5.setText("Estado");

        CBsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", " " }));

        TFestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", " " }));

        jLabel6.setText("Parentesco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BTRegistrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3)
                                .addComponent(TFestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFCurp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(TFnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFPArentesco, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(TFCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFPArentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(BTRegistrar))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTRegistrarActionPerformed
        if (cnx == null || cnx.con == null) {
            JOptionPane.showMessageDialog(this, "No hay conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Responsables resp = new Responsables(
            TFCurp.getText(),                      // 1. curpr
            TFnombre.getText(),                    // 2. nombrer
            CBsexo.getSelectedItem().toString(),   // 3. sexor
            TFTelefono.getText(),                  // 4. telefono
            TFPArentesco.getText(),                // 5. parentesco
            TFestado.getSelectedItem().toString()   // 6. estador
        );

        if (resp.insertar(cnx.con) == 1) {
            JOptionPane.showMessageDialog(this, "Responsable Registrado con éxito");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Responsable NO Registrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BTRegistrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (cnx == null || cnx.con == null) {
            JOptionPane.showMessageDialog(this, "No hay conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Responsables resp = new Responsables(
            TFCurp.getText(),                      // 1. curpr
            TFnombre.getText(),                    // 2. nombrer
            CBsexo.getSelectedItem().toString(),   // 3. sexor
            TFTelefono.getText(),                  // 4. telefono
            TFPArentesco.getText(),                // 5. parentesco
            TFestado.getSelectedItem().toString()   // 6. estador
        );

        if (resp.actualizar(cnx.con) == 1) {
            JOptionPane.showMessageDialog(this, "Responsable Actualizado con éxito");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Responsable NO Actualizado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (cnx == null || cnx.con == null) {
            JOptionPane.showMessageDialog(this, "No hay conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Responsables resp = new Responsables();
        resp.curpr = TFCurp.getText(); 

    if (resp.borrar(cnx.con) == 1) { 
            JOptionPane.showMessageDialog(this, "Responsable Borrado con éxito");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Responsable NO Borrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDResponsables dialog = new JDResponsables(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTRegistrar;
    private javax.swing.JComboBox<String> CBsexo;
    private javax.swing.JTextField TFCurp;
    private javax.swing.JTextField TFPArentesco;
    private javax.swing.JTextField TFTelefono;
    private javax.swing.JComboBox<String> TFestado;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
