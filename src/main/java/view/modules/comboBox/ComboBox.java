package view.modules.comboBox;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;
import view.beans.ColorBeans;


public class ComboBox extends JComboBox  {

    public ComboBox() {
        addItem("Objeto 1");
        addItem("Objeto 2");
        addItem("Objeto 3");
        addItem("Objeto 4");
        addItem("Objeto 5");
     
        setBackground(ColorBeans.getLftColor());
        setForeground(ColorBeans.getTxtColor());
        setUI(ComboUI.createUI(this));
        setRenderer(new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int i, boolean bln, boolean bln1) {
                Component com = super.getListCellRendererComponent(list, o, i, bln, bln1);
                
                if (bln) {
                    setBorder(new EmptyBorder(5, 5, 5, 5));
                    com.setBackground(ColorBeans.getLftColor());
                    com.setForeground(ColorBeans.getTxtColor());
                }
                return com;
            }
            
            
        });
    }
    
}

