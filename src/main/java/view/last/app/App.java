package view.last.app;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import view.last.panels.HomePanel;

public class App extends javax.swing.JFrame {

    public App() {
        
        setResizable(false);
        setUndecorated(true);
        
        initComponents();
        
        HomePanel home = new HomePanel();
        home.setSize(820, 600);
        home.setLocation(0,0);
        
                
        content.removeAll();
        content.add(home, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
        
        Color leftColor = new Color(69, 71, 90);
        Color rightColor = new Color(49, 50, 68);
        
        JPanel [] rightPanels = {
            titleMain,
            content
        };
        
        JPanel [] leftPanels = {
            titleDashboard,
            dashboard
        };
        
        setBckgr(leftPanels, leftColor);
        setBckgr(rightPanels, rightColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        titleDashboard = new javax.swing.JPanel();
        titleMain = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setPreferredSize(new java.awt.Dimension(1020, 40));
        title.setLayout(new java.awt.BorderLayout());

        titleDashboard.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout titleDashboardLayout = new javax.swing.GroupLayout(titleDashboard);
        titleDashboard.setLayout(titleDashboardLayout);
        titleDashboardLayout.setHorizontalGroup(
            titleDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        titleDashboardLayout.setVerticalGroup(
            titleDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        title.add(titleDashboard, java.awt.BorderLayout.WEST);

        javax.swing.GroupLayout titleMainLayout = new javax.swing.GroupLayout(titleMain);
        titleMain.setLayout(titleMainLayout);
        titleMainLayout.setHorizontalGroup(
            titleMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        titleMainLayout.setVerticalGroup(
            titleMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        title.add(titleMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(title, java.awt.BorderLayout.NORTH);

        main.setLayout(new java.awt.BorderLayout());

        dashboard.setPreferredSize(new java.awt.Dimension(200, 600));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        main.add(dashboard, java.awt.BorderLayout.WEST);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        main.add(content, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                App app = new App();
                app.setLocationRelativeTo(null);
                app.setVisible(true);
            }
        });
    }
    
    private void setBckgr(JPanel [] panel, Color color) {
        for (JPanel pnl : panel) {
            pnl.setBackground(color);
        }  
    }
    
    private void showPanel(JPanel p) {
        p.setSize(840, 590);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel main;
    private javax.swing.JPanel title;
    private javax.swing.JPanel titleDashboard;
    private javax.swing.JPanel titleMain;
    // End of variables declaration//GEN-END:variables
}