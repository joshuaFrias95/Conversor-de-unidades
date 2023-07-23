package view.modules.contentPanels;

import javax.swing.JPanel;
import controller.beans.ColorBeans;

public class ContentPanel extends JPanel {

    public ContentPanel() {
        setBackground(ColorBeans.getRgtColor());
        setSize(820, 590);
    }
    
}
