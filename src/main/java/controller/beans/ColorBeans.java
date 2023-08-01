package controller.beans;

import java.awt.Color;
/**
 * Clase utilizada para almacenar y gestionar los colores utilizados a lo largo
 * de la interfaz gráfica 
 */
public class ColorBeans {
    
    
    static Color lftColor = new Color(69, 71, 90);
    static Color rgtColor = new Color(49, 50, 68);
    static Color txtColor = new Color(200, 200, 200);
    static Color txtBlack = new Color(16, 16, 16);
    static Color comboColor = new Color(210, 210, 210);
    static Color hoverColor = new Color(255, 184, 108);

    public static Color getComboColor() {
        return comboColor;
    }

    public static Color getTxtBlack() {
        return txtBlack;
    }
    
    public static Color getHoverColor() {
        return hoverColor;
    }

    public static Color getTxtColor() {
        return txtColor;
    }

    public static Color getLftColor() {
        return lftColor;
    }

    public static Color getRgtColor() {
        return rgtColor;
    }
    
    
    
}
