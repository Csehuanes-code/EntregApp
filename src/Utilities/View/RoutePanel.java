package Utilities.View;

import Resources.Algorithm.DayAsignator;
import Resources.Algorithm.Dijkstra;
import Resources.Algorithm.Route;
import Resources.Algorithm.PendingRoutListControlator;
import Utilities.Others.Day;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RoutePanel extends javax.swing.JFrame {

    private static int [][] costMatrix;
    private static RoutePanel instance;
    private int limit;
    
    public RoutePanel(int[][] costMatrix) {
        this.costMatrix = costMatrix;
        limit = costMatrix.length;
        initComponents();
    }
    
    public static RoutePanel getInstance(int [][] costMatrix){
        if(instance == null){
            instance = new RoutePanel(costMatrix);
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        appName = new javax.swing.JLabel();
        outBtn = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        destinyTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        origenTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setMinimumSize(new java.awt.Dimension(720, 490));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(720, 490));
        setSize(new java.awt.Dimension(750, 490));
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

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        combo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 110, -1));

        destinyTxt.setForeground(new java.awt.Color(204, 204, 204));
        destinyTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        destinyTxt.setText("Enter the destination point");
        destinyTxt.setBorder(null);
        destinyTxt.setOpaque(false);
        destinyTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                destinyTxtMousePressed(evt);
            }
        });
        destinyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinyTxtActionPerformed(evt);
            }
        });
        getContentPane().add(destinyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 140, -1));

        origenTxt.setForeground(new java.awt.Color(204, 204, 204));
        origenTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        origenTxt.setText("Enter the point of origin");
        origenTxt.setBorder(null);
        origenTxt.setOpaque(false);
        origenTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                origenTxtMousePressed(evt);
            }
        });
        origenTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenTxtActionPerformed(evt);
            }
        });
        getContentPane().add(origenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setText("Add route");
        jButton1.setFocusable(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Day");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 76, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setText("Origen");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 76, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setText("Destiny");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 76, -1, -1));

        jScrollPane1.setViewportView(txtPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 610, 230));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Pending Routes List");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, 20));

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

    private void origenTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origenTxtActionPerformed

    private void destinyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinyTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!origenTxt.getText().isEmpty() && 
                !destinyTxt.getText().isEmpty() && 
                combo.getSelectedIndex()!=0) {
            int origen = 0;
            int destiny = 0;
            try{
                origen = Integer.parseInt(origenTxt.getText());
                destiny = Integer.parseInt(destinyTxt.getText());
                if(origen >= 1 && origen <= limit && destiny >= 1 && destiny <= limit)
                {
                    Day day = DayAsignator.createDayByIndex(combo.getSelectedIndex());
                    int [] path = Dijkstra.getPath(costMatrix, origen, destiny);
                    int cost = Dijkstra.getMinimumCost(costMatrix, origen, destiny);
                    PendingRoutListControlator.addItem(new Route(origen, 
                            destiny, cost, day, path));
                    combo.setSelectedIndex(0);
                    origenTxt.setLocation(125, 100);
                    destinyTxt.setLocation(305, 100);
                    destinyTxt.setForeground(new Color(204,204,204));
                    origenTxt.setForeground(new Color(204,204,204));
                    destinyTxt.setText("Enter the destination point");
                    origenTxt.setText("Enter the point of origin");
                    txtPanel.setForeground(Color.BLACK);
                    if(!txtPanel.getText().isEmpty()) txtPanel.setText("");
                    txtPanel.setText(PendingRoutListControlator.sortRoutesByDays());
                    this.repaint();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Must be in range (1 - " + limit +")", 
                    "Number range error", JOptionPane.ERROR_MESSAGE, 
                    new ImageIcon(getClass().getResource("/Utilities/Pictures/problem.png")));
                    combo.setSelectedIndex(0);
                    destinyTxt.setForeground(new Color(204,204,204));
                    origenTxt.setForeground(new Color(204,204,204));
                    destinyTxt.setText("Enter the destination point");
                    origenTxt.setText("Enter the point of origin");
                    origenTxt.setLocation(120, 100);
                    destinyTxt.setLocation(300, 100);
                }
                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, 
                        "Debes ingresar un valor entero", 
                        "Error de ingreso", 
                        JOptionPane.ERROR_MESSAGE, 
                        new ImageIcon(getClass().getResource("/Utilities/Pictures/problem.png")));
                combo.setSelectedIndex(0);
                destinyTxt.setForeground(new Color(204,204,204));
                origenTxt.setForeground(new Color(204,204,204));
                destinyTxt.setText("Enter the destination point");
                origenTxt.setText("Enter the point of origin");
                origenTxt.setLocation(120, 100);
                destinyTxt.setLocation(300, 100);
            }
            
        }
        else {
            JOptionPane.showMessageDialog(null, "You must fill in all the fields", 
                    "Missing field", JOptionPane.ERROR_MESSAGE, 
                    new ImageIcon(getClass().getResource("/Utilities/Pictures/problem.png")));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void origenTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_origenTxtMousePressed
        // TODO add your handling code here:
        if(origenTxt.getText().equals("Enter the point of origin")){
            origenTxt.setText("");
            origenTxt.setForeground(Color.black);
        }
        else if(origenTxt.getText().isEmpty()) {
            origenTxt.setForeground(new Color(204, 204, 204));
            origenTxt.setText("Enter the point of origin");
        }
    }//GEN-LAST:event_origenTxtMousePressed

    private void destinyTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinyTxtMousePressed
        // TODO add your handling code here:
        if(destinyTxt.getText().equals("Enter the destination point")){
            destinyTxt.setText("");
            destinyTxt.setForeground(Color.black);
        }
        else if(destinyTxt.getText().isEmpty()) {
            destinyTxt.setForeground(new Color(204, 204, 204));
            destinyTxt.setText("Enter the destination point");
        }
    }//GEN-LAST:event_destinyTxtMousePressed

    
//    public static void main(String args[]) {
//        try {
//            UIManager.setLookAndFeel(
//                UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
//        } 
//        java.awt.EventQueue.invokeLater(() -> {
////            new RoutePanel().setVisible(true);
//        });
//    }

    public ArrayList<Route> getPendingRoutes() {
        return PendingRoutListControlator.getDataList();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField destinyTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField origenTxt;
    private javax.swing.JButton outBtn;
    private javax.swing.JTextPane txtPanel;
    // End of variables declaration//GEN-END:variables
}
