package controller.beans;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ImportBeans {
    
    /**
     * Método que permite agregar imagenes a un JLabel
     * 
     * @param  url
     * @param label 
     * 
     */
    public void ImportImage(String url, JLabel label) {
        try {
            
            File file = new File(url);
            BufferedImage bufferedImage = ImageIO.read(file);
            
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            
            label.setIcon(imageIcon);
            label.setVerticalAlignment(SwingConstants.CENTER);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            
        } catch (IOException e) {
            
            System.out.println("No pudo cargarse la imagen");
            
        }  
    }
    
    
    /**
     * Método que permite agregar imagenes a un JButton
     * 
     * @param url
     * @param btn 
     */
    public void ImportImage(String url, JButton btn) {
        try {
            
            File file = new File(url);
            BufferedImage bufferedImage = ImageIO.read(file);
            
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            
            btn.setIcon(imageIcon);
        } catch (IOException e) {
            
            System.out.println("No pudo cargarse la imagen");
            
        }  
    }    

    
}
