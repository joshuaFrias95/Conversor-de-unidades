package controller.logic;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class LongLogic {
    
    Double valor;
    Double result;

    

    /*
        Métodos Milimetros
    */
    
    public void milimetroToCentimetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / 10;
        txt2.setText(Double.toString(result));
    }
    
    public void milimetroToMetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
    
    public void milimetroToKilometro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 6);
        txt2.setText(Double.toString(result));
    }
    
    
    /*
        Métodos Centimetros
    */
    
    public void centimetroToMilimetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * 10;
        txt2.setText(Double.toString(result));
    }
    
    public void centimetroToMetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 2);
        txt2.setText(Double.toString(result));
    }
    
    public void centimetroToKilometro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 5);
        txt2.setText(Double.toString(result));
    }
    
    
     /*
        Métodos Kilometros
    */
    
    public void metroToMilimetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
    
    public void metroToCentimetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 2);
        txt2.setText(Double.toString(result));
    }
    
    public void metroToKilometro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
    
    
    
     /*
        Métodos Kilometros
    */
    
    public void kilometroToMilimetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 6);
        txt2.setText(Double.toString(result));
    }
    
    public void kilometroToCentimetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 5);
        txt2.setText(Double.toString(result));
    }
    
    public void kilometroToMetro(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
}
