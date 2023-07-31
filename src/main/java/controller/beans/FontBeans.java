package controller.beans;

import java.awt.Font;

/**
 * Clase utilizada para almacenar y gestionar los estilos de fuente 
 * utilizados a lo largo del programa
 */
public class FontBeans {
    
    static Font titleFont = new Font("Verdana", Font.BOLD, 19);
    static Font txtFFont = new Font("Verdana", Font.PLAIN, 19);
    static Font btnFont = new Font("Verdana", Font.PLAIN, 19);
    static Font txtFont = new Font("Arial", Font.PLAIN, 15);
    static Font comboFont = new Font("Arial", Font.PLAIN, 13); 

    public static Font getComboFont() {
        return comboFont;
    }

    public static Font getTxtFFont() {
        return txtFFont;
    }

    public static Font getTitleFont() {
        return titleFont;
    }

    public static Font getBtnFont() {
        return btnFont;
    }

    public static Font getTxtFont() {
        return txtFont;
    }
}
