package controller.logic;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.TempValues;

public class TempLogic {

    Double valor;
    Double result;

    

    /*
        Métodos Grados Celsius
    */
    
    public void celsiusToKelvin(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = valor + TempValues.celciusKelvin;
        txt2.setText(Double.toString(result));
    }
    
    public void celsiusToFahrenheit(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = (valor * 9 / 5) + TempValues.celciusFahrenheit;
        txt2.setText(Double.toString(result));
    }
    
    
    /*
        Métodos Grados Fahrenheit
    */
    
    public void FahrenheitToCelsius(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = (valor - TempValues.celciusFahrenheit) * 5 / 9;
        txt2.setText(Double.toString(result));
    }
    
    public void FahrenheitToKelvin(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = (valor - TempValues.celciusFahrenheit) * 5/9 + TempValues.FahrenheitKelvin;
        txt2.setText(Double.toString(result));
    }
    
    
    /*
        Métodos Grados Kelvin
    */
    public void kelvinToCelsius(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
         valor = Double.valueOf(txt1.getText());
        result = valor - TempValues.celciusKelvin;
        txt2.setText(Double.toString(result));
    }
    
    public void kelvinToFahrenheit(JTextField txt1, JTextField txt2, JComboBox com1, JComboBox com2) {
        valor = Double.valueOf(txt1.getText());
        result = (valor - TempValues.FahrenheitKelvin) * 9/5 + TempValues.celciusFahrenheit;
        txt2.setText(Double.toString(result));  
    }
}
