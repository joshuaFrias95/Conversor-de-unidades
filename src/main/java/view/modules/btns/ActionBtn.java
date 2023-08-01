package view.modules.btns;

import controller.beans.ColorBeans;
import static controller.beans.ImportBeans.ImportImage;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActionBtn extends Btns {

    public ActionBtn() {
        super();
        setBackground(ColorBeans.getRgtColor());
        setForeground(ColorBeans.getTxtColor());
        ImportImage("src/main/java/view/img/convertirW.png", this);
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
