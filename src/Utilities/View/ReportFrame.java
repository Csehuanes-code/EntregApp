package Utilities.View;

import Resources.Algorithm.CompletedRouteListControlator;
import Resources.Algorithm.PendingRoutListControlator;

public class ReportFrame extends javax.swing.JFrame {

    private static ReportFrame instance;
    
    public static ReportFrame getInstance(){
        if(instance == null) instance = new ReportFrame();
        return instance;
    }
    public ReportFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        appName = new javax.swing.JLabel();
        outBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel3.setText("EntregApp");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, -1));

        appName.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        appName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/Logo.png"))); // NOI18N
        getContentPane().add(appName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

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

        jScrollPane1.setViewportView(txtPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 610, 270));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Report");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setText("Do Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int completedRoutesCount = CompletedRouteListControlator.size();
        
        String message = "Rutas completadas: " + completedRoutesCount + 
                "\nCosto total: " + CompletedRouteListControlator.calculateTotalCost() +
                "\nRutasPendientes: " + PendingRoutListControlator.size();
        txtPanel.setText(message);
    }//GEN-LAST:event_jButton1ActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReportFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton outBtn;
    private javax.swing.JTextPane txtPanel;
    // End of variables declaration//GEN-END:variables
}
