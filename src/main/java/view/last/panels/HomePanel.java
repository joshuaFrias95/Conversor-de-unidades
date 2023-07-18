package view.last.panels;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class HomePanel extends javax.swing.JPanel {

    public HomePanel() {
        
        setBackground(new Color(49, 50, 68));
        
        initComponents();
         
        
        try {
            
            File file = new File("src/main/java/view/gui/img/aluraBlanco.png");
            BufferedImage bufferedImage = ImageIO.read(file);
            
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            
            logo.setIcon(imageIcon);
            logo.setVerticalAlignment(SwingConstants.CENTER);
            logo.setHorizontalAlignment(SwingConstants.CENTER);
            
        } catch (Exception e) {
            
            System.out.println("No pudo cargarse la imagen");
            
        }    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
