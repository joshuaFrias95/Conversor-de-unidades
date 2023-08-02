package controller.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.BytesValue;

public class ValueReader {
    
    public static void readerValue(JComboBox com1, JComboBox com2, JTextField txtfld, JTextField txtfld2) {
                
        switch (com1.getSelectedIndex()) {
            case 0 -> {
                switch (com2.getSelectedIndex()) {
                    
                    // Bit a byte
                    case 0 -> {
                        BytesLogic.bitsOperation(txtfld, txtfld2, BytesValue.bit, 1, 1);
                    }
                    
                    // Bit a kilobyte
                    case 1 -> {
                        BytesLogic.bitsOperation(txtfld, txtfld2, BytesValue.bit, 3, 3);
                    }
                    
                    // Bit a Megabyte
                    case 2 -> {
                        BytesLogic.bitsOperation(txtfld, txtfld2, BytesValue.bit, 6, 8);
                    }
                    
                    // Bit a Gigabyte
                    case 3 -> {
                        BytesLogic.bitsOperation(txtfld, txtfld2, BytesValue.bit, 15, 11);
                    }
                    
                    // Bit a Terabyte
                    case 4 -> { 
                        BytesLogic.bitsOperation(txtfld, txtfld2, BytesValue.bit, 18, 14);
                    }
                    default -> throw new AssertionError();
                }
            }

            default -> throw new AssertionError();
        }
    }
}
