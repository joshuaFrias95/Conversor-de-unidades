package view.panels;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import view.beans.Colors;
import view.beans.Imports;

public class HomePanel extends javax.swing.JPanel {

    public HomePanel() {
        
        setBackground(Colors.getRgtColor());
        setSize(820, 590);
        
        initComponents();
        
//        try {
//            
//            File file = new File("src/main/java/view/img/aluraBlanco.png");
//            BufferedImage bufferedImage = ImageIO.read(file);
//            
//            ImageIcon imageIcon = new ImageIcon(bufferedImage);
//            
//            logo.setIcon(imageIcon);
//            logo.setVerticalAlignment(SwingConstants.CENTER);
//            logo.setHorizontalAlignment(SwingConstants.CENTER);
//            
//        } catch (Exception e) {
//            
//            System.out.println("No pudo cargarse la imagen");
//            
//        }  
        
        new Imports().ImportImage("src/main/java/view/img/aluraBlanco.png", logo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
