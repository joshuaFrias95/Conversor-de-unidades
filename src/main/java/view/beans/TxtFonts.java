package view.beans;

import java.awt.Font;

public class TxtFonts {
    
    static Font titleFont = new Font("Verdana", Font.BOLD, 19);
    static Font btnFont = new Font("Verdana", Font.PLAIN, 16);
    static Font txtFont = new Font("Arial", Font.PLAIN, 15);

    

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
