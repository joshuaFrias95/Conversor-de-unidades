package view.modules.comboBox;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import view.beans.ColorBeans;
import view.beans.ImportBeans;

public class ComboUI extends BasicComboBoxUI {
    
    public static ComboBoxUI createUI(JComponent com) {
        return new ComboUI();      
    }

    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        btn.setBackground(ColorBeans.getLftColor());
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        btn.setBorder(emptyBorder);
        
        new ImportBeans().ImportImage("src/main/java/view/img/dropdown.png", btn);
        
        return btn;
    }
    
    

}
