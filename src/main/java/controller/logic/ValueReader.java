package controller.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ValueReader {
    
    public static void readerValue(JComboBox com1, JComboBox com2, JTextField txtfld, JTextField txtfld2) {
        
        Integer valor = Integer.valueOf(txtfld.getText());
        double result;
        BigDecimal showResult;
        
        switch (com1.getSelectedIndex()) {
            case 0 -> {
                switch (com2.getSelectedIndex()) {
                    case 0 -> {
                        result =valor / 8d;
                        txtfld2.setText(Double.toString(result));
                    }
                    
                    case 1 -> {
                        result = valor / 8000d;
                        showResult = new BigDecimal(result).setScale(8,RoundingMode.FLOOR);
                        txtfld2.setText(showResult.toString());
                    }
                    
                    case 2 -> {
                        result = valor / Math.pow(8d, 6);
                        showResult = new BigDecimal(result).setScale(10,RoundingMode.FLOOR);
                        txtfld2.setText(showResult.toString());
                    }
                    
                    case 3 -> {
                        result = valor / Math.pow(8d, 9);
                        showResult = new BigDecimal(result).setScale(30,RoundingMode.FLOOR);
                        txtfld2.setText(showResult.toString());
                    }
                    
                    case 4 -> { 
                        result = valor / Math.pow(8d, 12);
                        showResult = new BigDecimal(result).setScale(35,RoundingMode.FLOOR);
                        txtfld2.setText(showResult.toString());
                    }
                    default -> throw new AssertionError();
                }
            }

            default -> throw new AssertionError();
        }
    }
}
