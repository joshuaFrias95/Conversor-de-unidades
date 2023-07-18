package view.last.panels;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class DivisasPanel extends javax.swing.JPanel {

    public DivisasPanel() {
        
        Color color = new Color(49, 50, 68);
        setBackground(color);
        
        initComponents();
        
        try {
            
            File file = new File("src/main/java/view/gui/img/icons/divisas.png");
            BufferedImage bufferedImage = ImageIO.read(file);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            
            moduleIcon.setIcon(imageIcon);
            
        } catch(Exception e) {
            System.out.println("No se pudo cargar la imagen");
        }
        
//        panelTitle.setForeground(new Color(200, 200, 200));
//        panelTitle.setFont(new Font("verdana", Font.BOLD, 20));
//        
//        jTextField1.setUI(new BasicTextFieldUI());
//        //jTextField1.setBackground(new Color(40, 42, 54));
//        jTextField1.setBorder(BorderFactory.createMatteBorder(0,0,1,0, new Color(200, 200, 200)));
//        jTextField1.setFont(new Font("verdana", Font.PLAIN, 20));
//        jTextField1.setForeground(new Color(200, 200, 200));
//        
//        jTextField3.setUI(new BasicTextFieldUI());
//        //jTextField3.setBackground(new Color(40, 42, 54));
//        jTextField3.setBorder(BorderFactory.createMatteBorder(0,0,1,0, new Color(200, 200, 200)));
//        jTextField3.setFont(new Font("verdana", Font.PLAIN, 20));
//        jTextField3.setForeground(new Color(200, 200, 200));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moduleIcon = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(moduleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(772, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(moduleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel moduleIcon;
    // End of variables declaration//GEN-END:variables
}
