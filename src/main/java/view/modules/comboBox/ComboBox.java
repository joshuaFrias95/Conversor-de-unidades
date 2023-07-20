package view.modules.comboBox;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import org.jdesktop.animation.timing.Animator;
import view.beans.ColorBeans;

public class ComboBox extends JComboBox {

    public String getLabelText() {
        return labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    public boolean isMouseOver() {
        return mouseOver;
    }

    public void setMouseOver(boolean mouseOver) {
        this.mouseOver = mouseOver;
    }

    private String labelText = "Label";
    private boolean mouseOver;
    
    public ComboBox() {
        setBackground(ColorBeans.getLftColor());
        setBorder(new EmptyBorder(15, 3, 5, 3));
        setUI(new ComboUI());  // Agregar como parametro a this a ComboUI
     
    }  
    
    private class ComboUI extends BasicComboBoxUI {
        
        private Animator animator = null;
        private boolean animateHintText = true;
        private float location;
        private boolean show;
        private ComboBox combo;
        
        public ComboUI() {
            setBackground(ColorBeans.getRgtColor());
            setBorder(new EmptyBorder(10, 3, 5, 3));
        }
   
    }     
}

