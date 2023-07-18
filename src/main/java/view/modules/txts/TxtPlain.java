package view.modules.txts;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import view.beans.ColorBeans;
import view.beans.FontBeans;

public class TxtPlain extends JLabel {

    public TxtPlain() {
        setForeground(ColorBeans.getTxtColor());
        setFont(FontBeans.getTxtFont());
        setVerticalAlignment(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    
    
}
