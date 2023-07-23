package view.modules.txts;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import controller.beans.ColorBeans;
import controller.beans.FontBeans;

public class TxtPlain extends JLabel {

    public TxtPlain() {
        setForeground(ColorBeans.getTxtColor());
        setFont(FontBeans.getTxtFont());
        setVerticalAlignment(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    
    
}
