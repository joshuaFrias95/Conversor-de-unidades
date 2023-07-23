package view.modules.textFields;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import controller.beans.ColorBeans;
import controller.beans.FontBeans;


public class textField extends JTextField {

    public textField() {
        setBackground(ColorBeans.getRgtColor());
        setForeground(ColorBeans.getTxtColor());
        setCaretColor(ColorBeans.getTxtColor());
        setFont(FontBeans.getTxtFFont());
        setBorder(new EmptyBorder(20, 15, 3, 3));
        addFocusListener(new FocusAdapter(){
            @Override
            public void focusGained(FocusEvent e) {
                getCaret().setVisible(true);
            }
        
        });
    }
    
   @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); 
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        
        int width = getWidth();
        int height = getHeight();
        
        
        g2.fillRect(2, height - 1, width - 4, 1);
        g2.dispose();
    }
    
    
    
    
}
