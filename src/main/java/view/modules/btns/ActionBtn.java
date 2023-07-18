package view.modules.btns;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.beans.ColorBeans;

public class ActionBtn extends Btns {

    public ActionBtn() {
        super();
        setBackground(ColorBeans.getTxtColor());
        setForeground(ColorBeans.getTxtBlack());
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(ColorBeans.getHoverColor());
                setForeground(ColorBeans.getTxtBlack());
            }
        
        });
    }
    
}
