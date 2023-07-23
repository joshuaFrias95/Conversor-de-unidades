package view.modules.btns;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import controller.beans.ColorBeans;

public class TitleBtns extends Btns {

    public TitleBtns() {
        super();
        setBackground(ColorBeans.getRgtColor());
        setForeground(ColorBeans.getTxtColor());
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(ColorBeans.getHoverColor());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(ColorBeans.getTxtColor());
            }
            
        });
    }
    
}
