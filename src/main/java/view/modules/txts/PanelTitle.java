package view.modules.txts;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import view.beans.ColorBeans;
import view.beans.FontBeans;

public class PanelTitle extends JLabel{

    public PanelTitle() {
        setForeground(ColorBeans.getTxtColor());
        setFont(FontBeans.getTitleFont());
        //setVerticalAlignment(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.LEFT);
    }
    
}
