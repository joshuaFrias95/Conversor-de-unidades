package main.gui.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

public class MainApp extends javax.swing.JFrame {

    public MainApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        dashboardTitleBar = new javax.swing.JPanel();
        mainTitleBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleBar.setPreferredSize(new java.awt.Dimension(1020, 50));
        titleBar.setLayout(new java.awt.BorderLayout());

        dashboardTitleBar.setBackground(new java.awt.Color(68, 71, 90));
        dashboardTitleBar.setPreferredSize(new java.awt.Dimension(180, 50));

        javax.swing.GroupLayout dashboardTitleBarLayout = new javax.swing.GroupLayout(dashboardTitleBar);
        dashboardTitleBar.setLayout(dashboardTitleBarLayout);
        dashboardTitleBarLayout.setHorizontalGroup(
            dashboardTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        dashboardTitleBarLayout.setVerticalGroup(
            dashboardTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        titleBar.add(dashboardTitleBar, java.awt.BorderLayout.WEST);

        mainTitleBar.setBackground(new java.awt.Color(40, 42, 54));

        jLabel1.setText("Conversor de unidades ONE G5");

        jButton1.setText("X");

        jButton2.setText("_");

        javax.swing.GroupLayout mainTitleBarLayout = new javax.swing.GroupLayout(mainTitleBar);
        mainTitleBar.setLayout(mainTitleBarLayout);
        mainTitleBarLayout.setHorizontalGroup(
            mainTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTitleBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );
        mainTitleBarLayout.setVerticalGroup(
            mainTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainTitleBarLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(mainTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        titleBar.add(mainTitleBar, java.awt.BorderLayout.CENTER);

        getContentPane().add(titleBar, java.awt.BorderLayout.NORTH);

        main.setLayout(new java.awt.BorderLayout());

        dashboard.setBackground(new java.awt.Color(68, 71, 90));
        dashboard.setPreferredSize(new java.awt.Dimension(180, 590));
        dashboard.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(68, 71, 90));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 470));

        jButton3.setText("Divisas");

        jButton4.setText("Temperatura");

        jButton5.setText("Medidas");

        jButton6.setText("Peso");

        jButton8.setText("Bytes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        dashboard.add(jPanel1, java.awt.BorderLayout.SOUTH);

        main.add(dashboard, java.awt.BorderLayout.WEST);

        content.setBackground(new java.awt.Color(40, 42, 54));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        main.add(content, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(JPanel p) {
       
        p.setSize(840, 590);
        p.setLocation(840, 590);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    private void buttonStyle(String font, JButton [] arrbtn, int bgr, int bgg, int bgb, int size) {
        
        for (JButton btn : arrbtn) {
            btn.setUI(new BasicButtonUI());
            btn.setBackground(new Color(bgr, bgg, bgb));
            btn.setForeground(new Color(200, 200, 200));
            btn.setFont(new Font(font, Font.BOLD, size));
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mousePressed(MouseEvent me) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            });
        }
        
    }
    
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainApp app = new MainApp();
                app.pack();
                app.setLocationRelativeTo(null);
                app.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel dashboardTitleBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainTitleBar;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
