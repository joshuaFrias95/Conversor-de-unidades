package view.gui.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HomePanel extends javax.swing.JPanel {

    public HomePanel() {
        
        setBackground(new Color(0.30f, 0.30f, 0.46f, 0.75f));
        
        initComponents();
         
        
        try {
            
            File file = new File("src/main/java/view/gui/img/aluraBlanco.png");
            BufferedImage bufferedImage = ImageIO.read(file);
            
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            
            logo.setIcon(imageIcon);
            
        } catch (Exception e) {
            
            System.out.println("No pudo cargarse la imagen");
            
        }
        
        JLabel [] textHome = {
            titulo1,
            titulo2,
            titulo3
        };

        for (JLabel tx : textHome) {
            tx.setForeground(new Color(200,200,200));
            tx.setFont(new Font("Cantarell", Font.PLAIN, 15));
        }
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        titulo1.setText("Challenge Conversor de unidades del programa ONE NEXT EDUCATION");

        titulo2.setText("Realizado por Joshua Frías");

        titulo3.setText("México 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(titulo1)
                .addGap(18, 18, 18)
                .addComponent(titulo2)
                .addGap(18, 18, 18)
                .addComponent(titulo3)
                .addGap(204, 204, 204))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
