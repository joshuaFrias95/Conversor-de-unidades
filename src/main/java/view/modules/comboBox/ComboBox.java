package view.modules.comboBox;

import javax.swing.JComboBox;


public class ComboBox extends JComboBox  {

    public ComboBox() {
        setEditable(false);
        setUI(ComboUI.createUI(this));
        addItem("Unidad 1");
        addItem("Unidad 2");
        addItem("Unidad 3");
        addItem("Unidad 4");
        addItem("Unidad 5");
    }
    
}

