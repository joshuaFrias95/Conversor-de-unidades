package view.last.modules.btns;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicButtonUI;

public class Btns extends JButton{

    public Btns() {
        
        Font mainFont = new Font("Verdana", Font.PLAIN, 19);
        
        
        
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        
        setUI(new BasicButtonUI());
        setForeground(new Color(200, 200, 200));
        setFont(mainFont);
        setBorder(emptyBorder);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                setRolloverEnabled(false);
                setContentAreaFilled(false);
                setFocusPainted(false);
                setOpaque(false);
                setForeground(new Color(255, 184, 108));
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setRolloverEnabled(false);
                setContentAreaFilled(false);
                setFocusPainted(false);
                setOpaque(false);
                setForeground(new Color(200, 200, 200));
            }
        
        });
        
    }
    
    
    
}
