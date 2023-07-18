package view.modules.txts;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import view.beans.Colors;
import view.beans.TxtFonts;

public class TxtPlain extends JLabel {

    public TxtPlain() {
        setForeground(Colors.getTxtColor());
        setFont(TxtFonts.getTxtFont());
        setVerticalAlignment(SwingConstants.CENTER);
        setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    
    
}
