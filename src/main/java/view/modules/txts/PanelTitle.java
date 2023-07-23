package view.modules.txts;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import controller.beans.ColorBeans;
import controller.beans.FontBeans;

public class PanelTitle extends JLabel{

    public PanelTitle() {
        setForeground(ColorBeans.getTxtColor());
        setFont(FontBeans.getTitleFont());
        //setVerticalAlignment(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.LEFT);
    }
    
}
