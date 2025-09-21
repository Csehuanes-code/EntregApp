package Main;

import Utilities.View.RoutePanel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main extends javax.swing.JFrame {

    App app = new App(this);
    RoutePanel routePanel;
    
    public Main() {
        initComponents();
        addRouteBtn.setEnabled(false);
        addRouteInfoBtn.setEnabled(false);
        doRouteBtn.setEnabled(false);
        doRuthInfoBtn.setEnabled(false);
        pendingRoutesBtn.setEnabled(false);
        pendingRoutesInfoBtn.setEnabled(false);
        completedRoutesBtn.setEnabled(false);
        completedRoutesInfoBtn.setEnabled(false);
        weeklyPlanBtn.setEnabled(false);
        weeklyPlanInfoBtn.setEnabled(false);
        reportBtn.setEnabled(false);
        reportInfoBtn.setEnabled(false);
        graphicBtn.setEnabled(false);
        graphicInfoBtn.setEnabled(false);
        
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Utilities/Pictures/Logo.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outBtn = new javax.swing.JButton();
        importBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reportBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        appName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        doRouteBtn = new javax.swing.JButton();
        pendingRoutesBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pendingRoutesInfoBtn = new javax.swing.JButton();
        importInfoBtn = new javax.swing.JButton();
        reportInfoBtn = new javax.swing.JButton();
        doRuthInfoBtn = new javax.swing.JButton();
        weeklyPlanBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        weeklyPlanInfoBtn = new javax.swing.JButton();
        completedRoutesBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        completedRoutesInfoBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addRouteBtn = new javax.swing.JButton();
        addRouteInfoBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        graphicInfoBtn = new javax.swing.JButton();
        graphicBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        backgroud = new javax.swing.JLabel();

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

        importBtn.setBackground(new java.awt.Color(255, 255, 204));
        importBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/folder.png"))); // NOI18N
        importBtn.setBorder(null);
        importBtn.setOpaque(false);
        importBtn.setContentAreaFilled(false);
        importBtn.setFocusPainted(false);
        importBtn.setBorderPainted(false);
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });
        getContentPane().add(importBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 30, 30));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel1.setText("Import");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 40, -1));

        reportBtn.setBackground(new java.awt.Color(255, 255, 204));
        reportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/report.png"))); // NOI18N
        reportBtn.setBorder(null);
        reportBtn.setOpaque(false);
        reportBtn.setContentAreaFilled(false);
        reportBtn.setFocusPainted(false);
        reportBtn.setBorderPainted(false);
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 28, 30));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel2.setText("Report");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        appName.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        appName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/Logo.png"))); // NOI18N
        getContentPane().add(appName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel3.setText("EntregApp");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 80, 421, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/map.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 420, 190));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 270, 421, 10));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 20, 191));

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 80, 20, 191));

        doRouteBtn.setBackground(new java.awt.Color(255, 255, 204));
        doRouteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/tracking.png"))); // NOI18N
        doRouteBtn.setBorder(null);
        doRouteBtn.setOpaque(false);
        doRouteBtn.setContentAreaFilled(false);
        doRouteBtn.setFocusPainted(false);
        doRouteBtn.setBorderPainted(false);
        doRouteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doRouteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(doRouteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 30, 30));

        pendingRoutesBtn.setBackground(new java.awt.Color(255, 255, 204));
        pendingRoutesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/pendingTasks.png"))); // NOI18N
        pendingRoutesBtn.setOpaque(false);
        pendingRoutesBtn.setContentAreaFilled(false);
        pendingRoutesBtn.setFocusPainted(false);
        pendingRoutesBtn.setBorderPainted(false);
        pendingRoutesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingRoutesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(pendingRoutesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 30, 30));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel5.setText("Do route");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel6.setText("Pending");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        pendingRoutesInfoBtn.setBackground(new java.awt.Color(255, 255, 204));
        pendingRoutesInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/info.png"))); // NOI18N
        pendingRoutesInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingRoutesInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(pendingRoutesInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 15, 15));

        importInfoBtn.setBackground(new java.awt.Color(255, 255, 204));
        importInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/info.png"))); // NOI18N
        importInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(importInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 15, 15));

        reportInfoBtn.setBackground(new java.awt.Color(255, 255, 204));
        reportInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/info.png"))); // NOI18N
        reportInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reportInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 15, 15));

        doRuthInfoBtn.setBackground(new java.awt.Color(255, 255, 204));
        doRuthInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/info.png"))); // NOI18N
        doRuthInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doRuthInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(doRuthInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 15, 15));

        weeklyPlanBtn.setBackground(new java.awt.Color(255, 255, 204));
        weeklyPlanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/timePlanning.png"))); // NOI18N
        weeklyPlanBtn.setBorder(null);
        weeklyPlanBtn.setOpaque(false);
        weeklyPlanBtn.setContentAreaFilled(false);
        weeklyPlanBtn.setFocusPainted(false);
        weeklyPlanBtn.setBorderPainted(false);
        weeklyPlanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeklyPlanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(weeklyPlanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 30, 30));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel7.setText("Weekly plan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        weeklyPlanInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/info.png"))); // NOI18N
        weeklyPlanInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeklyPlanInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(weeklyPlanInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 15, 15));

        completedRoutesBtn.setBackground(new java.awt.Color(255, 255, 204));
        completedRoutesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/doTask.png"))); // NOI18N
        completedRoutesBtn.setBorder(null);
        completedRoutesBtn.setOpaque(false);
        completedRoutesBtn.setContentAreaFilled(false);
        completedRoutesBtn.setFocusPainted(false);
        completedRoutesBtn.setBorderPainted(false);
        completedRoutesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedRoutesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(completedRoutesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 30, 30));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel8.setText("Completed");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        completedRoutesInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/info.png"))); // NOI18N
        completedRoutesInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedRoutesInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(completedRoutesInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 15, 15));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel9.setText("routes");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel10.setText("routes");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        addRouteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/crossE.png"))); // NOI18N
        addRouteBtn.setBorder(null);
        addRouteBtn.setContentAreaFilled(false);
        addRouteBtn.setFocusPainted(false);
        addRouteBtn.setBorderPainted(false);
        addRouteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRouteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addRouteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 30, 30));

        addRouteInfoBtn.setBackground(new java.awt.Color(255, 255, 204));
        addRouteInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/info.png"))); // NOI18N
        addRouteInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRouteInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addRouteInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 15, 15));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel11.setText("Add routes");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        graphicInfoBtn.setBackground(new java.awt.Color(255, 255, 204));
        graphicInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/info.png"))); // NOI18N
        graphicInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(graphicInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 15, 15));

        graphicBtn.setBackground(new java.awt.Color(255, 255, 204));
        graphicBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/error.png"))); // NOI18N
        graphicBtn.setBorder(null);
        graphicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicBtnActionPerformed(evt);
            }
        });
        getContentPane().add(graphicBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 28, 30));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        jLabel12.setText("Graphics");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilities/Pictures/fondo.png"))); // NOI18N
        backgroud.setOpaque(true);
        getContentPane().add(backgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 750, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void outBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_outBtnActionPerformed

    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed
        // TODO add your handling code here:
        app.loadFile();
        if(app.getFileLoaded()) {
            routePanel = new RoutePanel(app.getCostMatrix());
            addRouteBtn.setEnabled(true);
            addRouteInfoBtn.setEnabled(true);
        }
        
    }//GEN-LAST:event_importBtnActionPerformed

    private void doRouteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doRouteBtnActionPerformed
        // TODO add your handling code here:
        app.doRoute();
    }//GEN-LAST:event_doRouteBtnActionPerformed

    private void importInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importInfoBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Importa la el archivo .CSV que contiene las rutas asignadas", 
                "Import information", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Utilities/Pictures/folder.png")));
    }//GEN-LAST:event_importInfoBtnActionPerformed

    private void reportInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportInfoBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Realizar un reporte general", 
                "Report", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Utilities/Pictures/report.png")));
    }//GEN-LAST:event_reportInfoBtnActionPerformed

    private void doRuthInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doRuthInfoBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Realiza una de las ruta pendientes en tu lista de rutas", 
                "Do Ruth information", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Utilities/Pictures/tracking.png")));
    }//GEN-LAST:event_doRuthInfoBtnActionPerformed

    private void pendingRoutesInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingRoutesInfoBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Lista de rutas pendientes por realizar", 
                "Pending Ruth List information", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Utilities/Pictures/pendingTasks.png")));
    }//GEN-LAST:event_pendingRoutesInfoBtnActionPerformed

    private void pendingRoutesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingRoutesBtnActionPerformed
        // TODO add your handling code here:
        app.showPendingRoutes();
    }//GEN-LAST:event_pendingRoutesBtnActionPerformed

    private void weeklyPlanInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeklyPlanInfoBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Plan de ruta semanal, rutas ordenadas por cada dia de la semana", 
                "Weekly Plan Information", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Utilities/Pictures/timePlanning.png")));
    }//GEN-LAST:event_weeklyPlanInfoBtnActionPerformed

    private void completedRoutesInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completedRoutesInfoBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Lista de rutas realizadas", 
                "Completed Route List Informatio", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Utilities/Pictures/doTask.png")));
    }//GEN-LAST:event_completedRoutesInfoBtnActionPerformed

    private void completedRoutesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completedRoutesBtnActionPerformed
        // TODO add your handling code here:
        app.showCompletedRoutes();
    }//GEN-LAST:event_completedRoutesBtnActionPerformed

    private void addRouteInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRouteInfoBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Añade las rutas por dia a realizar", 
                "Add Route Informatio", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Utilities/Pictures/crossE.png")));
    }//GEN-LAST:event_addRouteInfoBtnActionPerformed

    private void addRouteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRouteBtnActionPerformed
        // TODO add your handling code here:
        routePanel.setVisible(true);
        doRouteBtn.setEnabled(true);
        doRuthInfoBtn.setEnabled(true);
        pendingRoutesBtn.setEnabled(true);
        pendingRoutesInfoBtn.setEnabled(true);
        completedRoutesBtn.setEnabled(true);
        completedRoutesInfoBtn.setEnabled(true);
        weeklyPlanBtn.setEnabled(true);
        weeklyPlanInfoBtn.setEnabled(true);
        reportBtn.setEnabled(true);
        reportInfoBtn.setEnabled(true);
        graphicBtn.setEnabled(true);
        graphicInfoBtn.setEnabled(true);
        
    }//GEN-LAST:event_addRouteBtnActionPerformed

    private void weeklyPlanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeklyPlanBtnActionPerformed
        // TODO add your handling code here:
        app.weeklyPlan();
    }//GEN-LAST:event_weeklyPlanBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        // TODO add your handling code here:
        app.report();
    }//GEN-LAST:event_reportBtnActionPerformed

    private void graphicInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicInfoBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, 
                "Obten una vista grafica de las rutas pendientes", 
                "Grafica", JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Utilities/Pictures/error.png")));
    }//GEN-LAST:event_graphicInfoBtnActionPerformed

    private void graphicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicBtnActionPerformed
        // TODO add your handling code here:
        app.showGraphics();
        
    }//GEN-LAST:event_graphicBtnActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        } 
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRouteBtn;
    private javax.swing.JButton addRouteInfoBtn;
    private javax.swing.JLabel appName;
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton completedRoutesBtn;
    private javax.swing.JButton completedRoutesInfoBtn;
    private javax.swing.JButton doRouteBtn;
    private javax.swing.JButton doRuthInfoBtn;
    private javax.swing.JButton graphicBtn;
    private javax.swing.JButton graphicInfoBtn;
    private javax.swing.JButton importBtn;
    private javax.swing.JButton importInfoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton outBtn;
    private javax.swing.JButton pendingRoutesBtn;
    private javax.swing.JButton pendingRoutesInfoBtn;
    private javax.swing.JButton reportBtn;
    private javax.swing.JButton reportInfoBtn;
    private javax.swing.JButton weeklyPlanBtn;
    private javax.swing.JButton weeklyPlanInfoBtn;
    // End of variables declaration//GEN-END:variables

}
