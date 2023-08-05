package controller.logic;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class MasaLogic {
    
     Double valor;
    Double result;

    

    /*
        Métodos Miligramo
    */
    
    public void miligramoToGramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
    
    public void miligramoToKilogramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 6);
        txt2.setText(Double.toString(result));
    }
    
    public void miligramoToTonelada(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 9);
        txt2.setText(Double.toString(result));
    }
    
    
    
    /*
        Métodos Gramo
    */
    
    public void gramoToMiligramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
    
    public void gramoToKilogramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
    
    public void gramoToTonelada(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 6);
        txt2.setText(Double.toString(result));
    }
       
    
    
    /*
        Métodos Tonelada
    */
    
    public void toneladaToMiligramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 9);
        txt2.setText(Double.toString(result));
    }
    
    public void toneladaToGramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 6);
        txt2.setText(Double.toString(result));
    }
    
    public void toneladaToKilogramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }   
    
    
    /*
        Métodos Kilogramo
    */
    
    public void kilogramoToMiligramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 6);
        txt2.setText(Double.toString(result));
    }
    
    public void kilogramoToGramo(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor * Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
    
    public void kilogramoToTonelada(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor / Math.pow(10, 3);
        txt2.setText(Double.toString(result));
    }
}
