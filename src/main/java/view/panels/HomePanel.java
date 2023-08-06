package view.panels;

import controller.beans.ImportBeans;


public class HomePanel extends javax.swing.JPanel {

    public HomePanel() {
        initComponents();
        
        ImportBeans.ImportImage("src/main/java/view/img/aluraBlanco.png", logo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPane1 = new view.modules.panels.RightPane();
        logo = new javax.swing.JLabel();
        txtPlain1 = new view.modules.txts.TxtPlain();
        txtPlain2 = new view.modules.txts.TxtPlain();
        txtPlain3 = new view.modules.txts.TxtPlain();

        txtPlain1.setText("Challenge Conversor de Unidades del Programa Oracle NEXT Education");

        txtPlain2.setText("Realizado por Joshua Frías");

        txtPlain3.setText("México, 2023");

        javax.swing.GroupLayout rightPane1Layout = new javax.swing.GroupLayout(rightPane1);
        rightPane1.setLayout(rightPane1Layout);
        rightPane1Layout.setHorizontalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPlain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rightPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rightPane1Layout.createSequentialGroup()
                        .addGroup(rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlain2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                            .addGroup(rightPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtPlain3, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        rightPane1Layout.setVerticalGroup(
            rightPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPane1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(txtPlain1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlain2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlain3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logo;
    private view.modules.panels.RightPane rightPane1;
    private view.modules.txts.TxtPlain txtPlain1;
    private view.modules.txts.TxtPlain txtPlain2;
    private view.modules.txts.TxtPlain txtPlain3;
    // End of variables declaration//GEN-END:variables
}
