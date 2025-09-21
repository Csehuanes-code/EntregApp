package Utilities.View;

import Resources.Algorithm.PendingRoutListControlator;

public class GraphicsFrame extends javax.swing.JFrame {

    private static GraphicsFrame instance;
    
    public static GraphicsFrame getInstance () {
        if(instance == null) instance = new GraphicsFrame();
        return instance;
    }
    
    public GraphicsFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        appName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrixPane = new javax.swing.JTextPane();
        GraphPane = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        outBtn.setBackground(new java.awt.Color(255, 255, 204));
        outBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/logout.png"))); // NOI18N
        outBtn.setBorder(null);
        outBtn.setOpaque(false);
        outBtn.setContentAreaFilled(false);
        outBtn.setFocusPainted(false);
        outBtn.setBorderPainted(false);
        outBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outBtnActionPerformed(evt);
            }
        });
        getContentPane().add(outBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 30, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel3.setText("EntregApp");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, -1));

        appName.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        appName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/Logo.png"))); // NOI18N
        getContentPane().add(appName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        jScrollPane1.setViewportView(matrixPane);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 90, 340, 350));

        javax.swing.GroupLayout GraphPaneLayout = new javax.swing.GroupLayout(GraphPane);
        GraphPane.setLayout(GraphPaneLayout);
        GraphPaneLayout.setHorizontalGroup(
            GraphPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        GraphPaneLayout.setVerticalGroup(
            GraphPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(GraphPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 90, 340, 350));

        jButton2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/whiteBackgroud.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 790, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void outBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(!(this.isVisible()));
    }//GEN-LAST:event_outBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        matrixPane.setText(PendingRoutListControlator.showMatrix());
        //Falta mostrar el grafo en el otro panel
        
    }//GEN-LAST:event_jButton2ActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GraphicsFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphPane;
    private javax.swing.JLabel appName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane matrixPane;
    private javax.swing.JButton outBtn;
    // End of variables declaration//GEN-END:variables
}
