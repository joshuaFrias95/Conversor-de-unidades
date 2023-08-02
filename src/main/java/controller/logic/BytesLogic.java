package controller.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JTextField;

public class BytesLogic {
    
    public static void bitsOperation(JTextField txtfld1, JTextField txtfld2, double operator, int potencia, int n) {
        
        Integer valor = Integer.valueOf(txtfld1.getText());
        double result;
        BigDecimal showResult;
        
        result = valor / operator;
        showResult = new BigDecimal(result).setScale(5).movePointLeft(n);
        txtfld2.setText(showResult.toString());
    }
}
