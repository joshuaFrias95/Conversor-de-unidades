package view.modules.comboBox;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import controller.beans.ColorBeans;
import controller.beans.FontBeans;


public class ComboBox extends JComboBox  {

    public ComboBox() {
        
        Border comboBoredes = new EmptyBorder(3, 3, 1, 0);
     
        setBackground(ColorBeans.getLftColor());
        setForeground(ColorBeans.getTxtColor());
        setBorder(comboBoredes);
        setFont(FontBeans.getComboFont());
        setFocusable(false);
        setUI(ComboUI.createUI(this));
        
        setRenderer(new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int i, boolean bln, boolean bln1) {
                Component com = super.getListCellRendererComponent(list, o, i, bln, bln1);
                
                if (bln) {
                    setBorder(comboBoredes);
                    com.setBackground(ColorBeans.getTxtColor());
                    com.setForeground(ColorBeans.getTxtBlack());
                }
                return com;
            }
            
            
        });
    }
    
}

