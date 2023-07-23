package view.modules.comboBox;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import controller.beans.ColorBeans;
import controller.beans.ImportBeans;

public class ComboUI extends BasicComboBoxUI {
     
    public static ComboBoxUI createUI(JComponent c) {
        
        return new ComboUI();
    }

    @Override
    protected JButton createArrowButton() {
        ArrowButton btn = new ArrowButton();
        new ImportBeans().ImportImage("src/main/java/view/img/dropdown.png", btn);
        return btn;
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {}
        
    private class ArrowButton extends JButton {

        public ArrowButton() {
            setBorder(new EmptyBorder(5, 5, 5, 5));
                setBackground(ColorBeans.getLftColor());
        }
        
    }
}
