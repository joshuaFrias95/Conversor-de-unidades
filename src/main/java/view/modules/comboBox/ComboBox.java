package view.modules.comboBox;

import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxUI;
import view.beans.ColorBeans;

public class ComboBox extends JComboBox {

    public ComboBox() {
        
        Border empty = BorderFactory.createEmptyBorder();
        
        setUI(new BasicComboBoxUI());
        setBackground(ColorBeans.getLftColor());
        setForeground(ColorBeans.getTxtColor());
        setBorder(empty);

    }
    
}
