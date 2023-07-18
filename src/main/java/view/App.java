package view;

import java.awt.BorderLayout;
import view.panels.HomePanel;


public class App extends javax.swing.JFrame {

    public App() {
        
        setResizable(false);
        //setUndecorated(true);
        
        initComponents();
        
        HomePanel home = new HomePanel();
        home.setSize(820,590);
        home.setLocation(0,0);
        
        content.removeAll();
        content.add(home, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        leftPane1 = new view.modules.panels.LeftPane();
        rightPane1 = new view.modules.panels.RightPane();
        main = new javax.swing.JPanel();
        leftPane2 = new view.modules.panels.LeftPane();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setPreferredSize(new java.awt.Dimension(1020, 50));
        title.setLayout(new java.awt.BorderLayout());

        leftPane1.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout leftPane1Layout = new javax.swing.GroupLayout(leftPane1);
        leftPane1.setLayout(leftPane1Layout);
        leftPane1Layout.setHorizontalGroup(
            leftPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        leftPane1Layout.setVerticalGroup(
            leftPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        title.add(leftPane1, java.awt.BorderLayout.WEST);

        rightPane1.setPreferredSize(new java.awt.Dimension(820, 50));

        javax.swing.GroupLayout rightPane1Layout = new javax.swing.GroupLayout(rightPane1);
        rightPane1.setLayout(rightPane1Layout);
        rightPane1Layout.setHorizontalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        rightPane1Layout.setVerticalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        title.add(rightPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(title, java.awt.BorderLayout.NORTH);

        main.setPreferredSize(new java.awt.Dimension(1020, 590));
        main.setLayout(new java.awt.BorderLayout());

        leftPane2.setPreferredSize(new java.awt.Dimension(200, 590));

        javax.swing.GroupLayout leftPane2Layout = new javax.swing.GroupLayout(leftPane2);
        leftPane2.setLayout(leftPane2Layout);
        leftPane2Layout.setHorizontalGroup(
            leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        leftPane2Layout.setVerticalGroup(
            leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        main.add(leftPane2, java.awt.BorderLayout.WEST);

        content.setPreferredSize(new java.awt.Dimension(820, 590));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        main.add(content, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            App app = new App();
            app.setLocationRelativeTo(null);
            app.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private view.modules.panels.LeftPane leftPane1;
    private view.modules.panels.LeftPane leftPane2;
    private javax.swing.JPanel main;
    private view.modules.panels.RightPane rightPane1;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
