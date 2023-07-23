package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import view.panels.BytesPanel;
import view.panels.DivisasPanel;
import view.panels.HomePanel;
import view.panels.MedidasPanel;
import view.panels.PesoPanel;
import view.panels.TempPanel;


public class App extends javax.swing.JFrame {

    public App() {
        
        setResizable(false);
        setUndecorated(true);
        
        initComponents();
        
        HomePanel home = new HomePanel();
        home.setSize(820,590);
        home.setLocation(0,0);
        
        paintContent(home);
    }

    private void paintContent(JPanel panel) {
        panel.setSize(820,590);
        panel.setLocation(0,0);
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        leftPane1 = new view.modules.panels.LeftPane();
        rightPane1 = new view.modules.panels.RightPane();
        titleBtns1 = new view.modules.btns.TitleBtns();
        titleBtns2 = new view.modules.btns.TitleBtns();
        main = new javax.swing.JPanel();
        leftPane2 = new view.modules.panels.LeftPane();
        menuBtns1 = new view.modules.btns.MenuBtns();
        menuBtns2 = new view.modules.btns.MenuBtns();
        menuBtns3 = new view.modules.btns.MenuBtns();
        menuBtns4 = new view.modules.btns.MenuBtns();
        menuBtns5 = new view.modules.btns.MenuBtns();
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

        titleBtns1.setText("X");
        titleBtns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleBtns1ActionPerformed(evt);
            }
        });

        titleBtns2.setText("_");

        javax.swing.GroupLayout rightPane1Layout = new javax.swing.GroupLayout(rightPane1);
        rightPane1.setLayout(rightPane1Layout);
        rightPane1Layout.setHorizontalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPane1Layout.createSequentialGroup()
                .addContainerGap(770, Short.MAX_VALUE)
                .addComponent(titleBtns2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleBtns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        rightPane1Layout.setVerticalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPane1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleBtns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleBtns2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        title.add(rightPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(title, java.awt.BorderLayout.NORTH);

        main.setPreferredSize(new java.awt.Dimension(1020, 590));
        main.setLayout(new java.awt.BorderLayout());

        leftPane2.setPreferredSize(new java.awt.Dimension(200, 590));

        menuBtns1.setText("Divisas");
        menuBtns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtns1ActionPerformed(evt);
            }
        });

        menuBtns2.setText("Temperatura");
        menuBtns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtns2ActionPerformed(evt);
            }
        });

        menuBtns3.setText("Medidas");
        menuBtns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtns3ActionPerformed(evt);
            }
        });

        menuBtns4.setText("Peso");
        menuBtns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtns4ActionPerformed(evt);
            }
        });

        menuBtns5.setText("Bytes");
        menuBtns5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtns5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPane2Layout = new javax.swing.GroupLayout(leftPane2);
        leftPane2.setLayout(leftPane2Layout);
        leftPane2Layout.setHorizontalGroup(
            leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPane2Layout.createSequentialGroup()
                .addGroup(leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuBtns1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(menuBtns2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(leftPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuBtns3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBtns4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBtns5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPane2Layout.setVerticalGroup(
            leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPane2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(menuBtns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuBtns2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuBtns3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuBtns4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuBtns5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        main.add(leftPane2, java.awt.BorderLayout.WEST);

        content.setPreferredSize(new java.awt.Dimension(820, 590));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        main.add(content, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleBtns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleBtns1ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_titleBtns1ActionPerformed

    private void menuBtns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtns1ActionPerformed
        DivisasPanel dp = new DivisasPanel();
        showPanel(dp);
    }//GEN-LAST:event_menuBtns1ActionPerformed

    private void menuBtns5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtns5ActionPerformed
        BytesPanel bp = new BytesPanel();
        showPanel(bp);
    }//GEN-LAST:event_menuBtns5ActionPerformed

    private void menuBtns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtns2ActionPerformed
        TempPanel tp = new TempPanel();
        showPanel(tp);
    }//GEN-LAST:event_menuBtns2ActionPerformed

    private void menuBtns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtns3ActionPerformed
        MedidasPanel mp = new MedidasPanel();
        showPanel(mp);
    }//GEN-LAST:event_menuBtns3ActionPerformed

    private void menuBtns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtns4ActionPerformed
        PesoPanel pp = new PesoPanel();
        showPanel(pp);
    }//GEN-LAST:event_menuBtns4ActionPerformed

    private void showPanel(JPanel p) {
        p.setSize(820, 590);
        p.setLocation(0, 0);
        
        paintContent(p);
    }
    
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
    private view.modules.btns.MenuBtns menuBtns1;
    private view.modules.btns.MenuBtns menuBtns2;
    private view.modules.btns.MenuBtns menuBtns3;
    private view.modules.btns.MenuBtns menuBtns4;
    private view.modules.btns.MenuBtns menuBtns5;
    private view.modules.panels.RightPane rightPane1;
    private javax.swing.JPanel title;
    private view.modules.btns.TitleBtns titleBtns1;
    private view.modules.btns.TitleBtns titleBtns2;
    // End of variables declaration//GEN-END:variables
}
