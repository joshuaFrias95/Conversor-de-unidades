package view.beans;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ImportBeans {
    
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
    
}
