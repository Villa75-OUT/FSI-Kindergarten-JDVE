
import javax.swing.JOptionPane;



    


public class FPrincipal extends javax.swing.JFrame {
    
    Conexion cnx = new Conexion();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FPrincipal.class.getName());

    public FPrincipal() {
        initComponents();
        
        Tquery.setAutoCreateRowSorter(true);
        
        if (cnx.conectar("127.0.0.1","kindergarten","root","")==1) {
            
          cnx.entablar(Infante.todos, Tquery);
          
          
           
            
        }
        
        else{
             JOptionPane.showMessageDialog(this, "Conexion Fallida");
            System.exit(0);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        Binfantes = new javax.swing.JToggleButton();
        Beducadores = new javax.swing.JToggleButton();
        Bresponsables = new javax.swing.JToggleButton();
        BBitacora = new javax.swing.JToggleButton();
        Bnuevo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tquery = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(255, 102, 204));
        jToolBar1.setRollover(true);

        buttonGroup1.add(Binfantes);
        Binfantes.setSelected(true);
        Binfantes.setText("INFANTES");
        Binfantes.setFocusable(false);
        Binfantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Binfantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Binfantes.addActionListener(this::BinfantesActionPerformed);
        jToolBar1.add(Binfantes);

        buttonGroup1.add(Beducadores);
        Beducadores.setText("EDUCADORES");
        Beducadores.setFocusable(false);
        Beducadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Beducadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Beducadores.addActionListener(this::BeducadoresActionPerformed);
        jToolBar1.add(Beducadores);

        buttonGroup1.add(Bresponsables);
        Bresponsables.setText("RESPONSABLES");
        Bresponsables.setFocusable(false);
        Bresponsables.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bresponsables.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bresponsables.addActionListener(this::BresponsablesActionPerformed);
        jToolBar1.add(Bresponsables);

        buttonGroup1.add(BBitacora);
        BBitacora.setText("BITACORA");
        BBitacora.setFocusable(false);
        BBitacora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BBitacora.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BBitacora.addActionListener(this::BBitacoraActionPerformed);
        jToolBar1.add(BBitacora);

        Bnuevo.setText("NUEVO");
        Bnuevo.setFocusable(false);
        Bnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bnuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bnuevo.addActionListener(this::BnuevoActionPerformed);
        jToolBar1.add(Bnuevo);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        Tquery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tquery);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BinfantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinfantesActionPerformed

        cnx.entablar(Infante.todos, Tquery);

    }//GEN-LAST:event_BinfantesActionPerformed

    private void BeducadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeducadoresActionPerformed
        cnx.entablar(Educadores.todos, Tquery);
    }//GEN-LAST:event_BeducadoresActionPerformed

    private void BresponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresponsablesActionPerformed
        cnx.entablar(Responsables.todos, Tquery);
    }//GEN-LAST:event_BresponsablesActionPerformed

    private void BBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBitacoraActionPerformed
       cnx.entablar(Bitacora.todos, Tquery);
    }//GEN-LAST:event_BBitacoraActionPerformed

    private void BnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevoActionPerformed
    
       if (Binfantes.isSelected()) {
            JDinfantes di = new JDinfantes(this, true);
            di.obtenerConexion(cnx);
            di.setVisible(true);
           
        } else if (BBitacora.isSelected()) {
            JDasistencias da = new JDasistencias(this, true);
            da.obtenerConexion(cnx);
            da.setVisible(true);
            
        } else if (Bresponsables.isSelected()) {
            JDResponsables dr = new JDResponsables(this, true);
            dr.obtenerConexion(cnx);
            dr.setVisible(true);
           
        } else if (Beducadores.isSelected()) {
            JDEducadores de = new JDEducadores(this, true);
            de.obtenerConexion(cnx);
            de.setVisible(true);
            
        }
            
    }//GEN-LAST:event_BnuevoActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BBitacora;
    private javax.swing.JToggleButton Beducadores;
    private javax.swing.JToggleButton Binfantes;
    private javax.swing.JButton Bnuevo;
    private javax.swing.JToggleButton Bresponsables;
    private javax.swing.JTable Tquery;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
