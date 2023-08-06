package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import view.panels.DivisasPanel;
import view.panels.HomePanel;
import view.panels.LongitudPanel;
import view.panels.MasaPanel;
import view.panels.TempPanel;

public class App extends javax.swing.JFrame {

    public App() {

        setResizable(false);
        setUndecorated(true);

        initComponents();

        paintContent(new HomePanel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        leftPane1 = new view.modules.panels.LeftPane();
        rightPane1 = new view.modules.panels.RightPane();
        titleBtns1 = new view.modules.btns.TitleBtns();
        main = new javax.swing.JPanel();
        leftPane2 = new view.modules.panels.LeftPane();
        divisasBtn = new view.modules.btns.MenuBtns();
        tempBtn = new view.modules.btns.MenuBtns();
        distBtn = new view.modules.btns.MenuBtns();
        pesoBtn = new view.modules.btns.MenuBtns();
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

        titleBtns1.setText("X");
        titleBtns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleBtns1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightPane1Layout = new javax.swing.GroupLayout(rightPane1);
        rightPane1.setLayout(rightPane1Layout);
        rightPane1Layout.setHorizontalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPane1Layout.createSequentialGroup()
                .addContainerGap(793, Short.MAX_VALUE)
                .addComponent(titleBtns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        rightPane1Layout.setVerticalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPane1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(titleBtns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        title.add(rightPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(title, java.awt.BorderLayout.NORTH);

        main.setLayout(new java.awt.BorderLayout());

        leftPane2.setPreferredSize(new java.awt.Dimension(200, 590));

        divisasBtn.setText("Divisas");
        divisasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisasBtnActionPerformed(evt);
            }
        });

        tempBtn.setText("Temperatura");
        tempBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempBtnActionPerformed(evt);
            }
        });

        distBtn.setText("Longitud");
        distBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distBtnActionPerformed(evt);
            }
        });

        pesoBtn.setText("Masa");
        pesoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPane2Layout = new javax.swing.GroupLayout(leftPane2);
        leftPane2.setLayout(leftPane2Layout);
        leftPane2Layout.setHorizontalGroup(
            leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divisasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(distBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(pesoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPane2Layout.setVerticalGroup(
            leftPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPane2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(divisasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tempBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(distBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        main.add(leftPane2, java.awt.BorderLayout.WEST);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        main.add(content, java.awt.BorderLayout.CENTER);

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleBtns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleBtns1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_titleBtns1ActionPerformed

    private void divisasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisasBtnActionPerformed
        paintContent(new DivisasPanel());
    }//GEN-LAST:event_divisasBtnActionPerformed

    private void tempBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempBtnActionPerformed
        paintContent(new TempPanel());
    }//GEN-LAST:event_tempBtnActionPerformed

    private void distBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distBtnActionPerformed
        paintContent(new LongitudPanel());
    }//GEN-LAST:event_distBtnActionPerformed

    private void pesoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoBtnActionPerformed
        paintContent(new MasaPanel());
    }//GEN-LAST:event_pesoBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            App app = new App();
            app.setLocationRelativeTo(null);
            app.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private view.modules.btns.MenuBtns distBtn;
    private view.modules.btns.MenuBtns divisasBtn;
    private view.modules.panels.LeftPane leftPane1;
    private view.modules.panels.LeftPane leftPane2;
    private javax.swing.JPanel main;
    private view.modules.btns.MenuBtns pesoBtn;
    private view.modules.panels.RightPane rightPane1;
    private view.modules.btns.MenuBtns tempBtn;
    private javax.swing.JPanel title;
    private view.modules.btns.TitleBtns titleBtns1;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que permite mostrar un panel dentro de otro. Es utilizado para mostrar
     * el Home Panel y para visualizar los diferentes conversores
     * 
     * @param panel - Panel que será mostrado en pantalla
     */
    private void paintContent(JPanel panel) {
        panel.setSize(820, 590);
        panel.setLocation(0, 0);

        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
}
