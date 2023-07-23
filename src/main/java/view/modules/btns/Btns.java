package view.modules.btns;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicButtonUI;
import controller.beans.FontBeans;

public class Btns extends JButton {

    public Btns() {
        
        Border empty = BorderFactory.createEmptyBorder();
        
        setUI(new BasicButtonUI());        
        setFont(FontBeans.getBtnFont());
        setBorder(empty);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                btnUi();
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnUi();
            }
        
        });
    }

    private void btnUi() {
        setRolloverEnabled(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
    }
    
}
