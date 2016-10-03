
package activofijos;
import javax.swing.JFrame;

public class Menuprincipal extends javax.swing.JFrame {
    /**
     * Creates new form Menuprincipal
     */
    public Menuprincipal() {
        initComponents();
    
                   
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        bndn = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activofijos/Imagenes/MELARA 1.jpg"))); // NOI18N
        jLabel1.setLabelFor(this);
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jLabel3.setText("jLabel3");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        getContentPane().setLayout(null);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/activofijos/Imagenes/MELARA 1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -510, 1380, 1390);

        jMenuBar1.setInheritsPopupMenu(true);
        jMenuBar1.setMaximumSize(new java.awt.Dimension(2000, 1250));

        bndn.setText("Activos Fijos");
        bndn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bndnItemStateChanged(evt);
            }
        });

        jMenuItem2.setText("Ingresar Datos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        bndn.add(jMenuItem2);

        jMenuBar1.add(bndn);

        jMenu2.setText("Detalles");

        jMenuItem3.setText("Clase de Activo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Proveedores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem1.setText("Ubicacion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem7.setText("Estados");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem9.setText("Responsable");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Calculos");

        jMenuItem5.setText("Calculo de Prestaciones ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Reportes");

        jMenuItem8.setText("Reporte Global");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Salir");

        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);
        this.dispose();

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bndnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bndnItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bndnItemStateChanged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // llamar al formulario de nombre de Activo:
        NombreActivo Na = new NombreActivo();
        //Na.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Na.setLocationRelativeTo(null);
        Na.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Na.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         System.exit(-1);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // llamar al formulario de proveedores:
        Proveedores P = new Proveedores();
        //P.setExtendedState(JFrame.MAXIMIZED_BOTH);
        P.setLocationRelativeTo(null);
        P.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        P.setVisible( true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         // llamar al formulario de Ubicacion:
        Ubicacion U = new Ubicacion();
        //P.setExtendedState(JFrame.MAXIMIZED_BOTH);
        U.setLocationRelativeTo(null);
        U.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        U.setVisible( true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // llamar al formulario de estado:
        EstadoActivo Ea = new EstadoActivo();
        //Ea.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Ea.setLocationRelativeTo(null);
        Ea.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Ea.setVisible( true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // llamar al formulario de Respomsable:
        Responsable R = new Responsable();
        //Ea.setExtendedState(JFrame.MAXIMIZED_BOTH);
        R.setLocationRelativeTo(null);
        R.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        R.setVisible( true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       // llamar al formulario de Asignacion Activo:
        Asignaciones lAsignaciones = new Asignaciones(new java.awt.Frame(), true);
        lAsignaciones.pack(); //se asegura de que la ventana se dibuje completa
        lAsignaciones.setLocationRelativeTo(null);  // Centra el formulario en la pantalla
        lAsignaciones.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       // llamar al formulario de Calculo de prestaciones:
        CalculosPrestaciones Aa = new CalculosPrestaciones();
        Aa.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Aa.setLocationRelativeTo(null);
        Aa.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Aa.setVisible( true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bndn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

    

       
}
