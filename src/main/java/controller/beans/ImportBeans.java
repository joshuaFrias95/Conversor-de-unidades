package controller.beans;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Clase utilizada para importar elementos gráficos
 */
public class ImportBeans {

    /**
     * Método que permite agregar imagenes a un JLabel
     *
     * @param url
     * @param label
     *
     */
    public static void ImportImage(String url, JLabel label) {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File(url));
            ImageIcon imageIcon = new ImageIcon(bufferedImage);

            label.setIcon(imageIcon);
            label.setVerticalAlignment(SwingConstants.CENTER);
            label.setHorizontalAlignment(SwingConstants.CENTER);

        } catch (IOException e) {
            System.out.println("No pudo cargarse la imagen");
        }
    }

    /**
     * Método que permite agregar imagenes a un JButton
     *
     * @param url
     * @param btn
     */
    public static void ImportImage(String url, JButton btn) {
        try {

            BufferedImage bufferedImage = ImageIO.read(new File(url));
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            btn.setIcon(imageIcon);
            
        } catch (IOException e) {
            System.out.println("No pudo cargarse la imagen");
        }
    }

    /**
     * Este método nos permite llenar el primer JComboBox de cada panel 
     * que va a permitir realizar las operaciones de forma más sencilla,
     * además de volver versátil al segundo.
     * 
     * @param com - JComboBox que se va a llenar
     * @param values - String de valores que van a llenar el parámetro "com"
     */
    public static void fillCombo(JComboBox com, String[] values) {
        com.removeAll();
        for(int i = 0; i < values.length; i++) {
            com.addItem(values[i]);
        }
    }
    
    public static void fillCombo(JComboBox com1, JComboBox com2, String[] values) {
        switch (com1.getSelectedIndex()) {
            case 0:
                dynamicComboElements(values, com1, com2);
                break;
            case 1:
                dynamicComboElements(values, com1, com2);
                break;
            case 2:
                dynamicComboElements(values, com1, com2);
                break;
            case 3:
                dynamicComboElements(values, com1, com2);
            case 4:
                dynamicComboElements(values, com1, com2);
            case 5:
                dynamicComboElements(values, com1, com2);
            default:
                break;
        }
        
    }

    private static void dynamicComboElements(String[] values, JComboBox com1, JComboBox com2) {
        com2.removeAllItems();
        for (int i = 0; i < values.length; i++) {
            if (i != com1.getSelectedIndex()) {
                com2.addItem(values[i]);
            } else {
                continue;
            }
        }
    }
    
    
    
    /**
     * El método justNumbers se encarga de restringir el uso de caracteres
     * alfabéticos y especiales para aceptar solamente números.
     *
     * Utiliza como parámetros dos JTextFields que son almacenados en un array
     * para una manipulación más sencilla y concreta.
     *
     * @param j1 - Primer JTextField
     * @param j2 - Segundo JTextField
     */
    public static void justPositiveNumbers(JTextField j1, JTextField j2) {

        // Array de JTextFields
        JTextField[] txtflds = {
            j1,
            j2
        };

        for (JTextField txtfld : txtflds) {
            txtfld.addKeyListener(new KeyAdapter() {

                /**
                 * Método que recibe cada caracter escrito en los JTextFields y
                 * permite o no que sean escritos únicamente números positivos,
                 * la técla BACKSPACE y únicamente un punto para valores double
                 *
                 * @param e - Utilizado para manejar el evento
                 */
                @Override
                public void keyTyped(KeyEvent e) {

                    char caracter = e.getKeyChar();

                    // Condicional que restringe caracteres alfabéticos
                    if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.')) {
                        e.consume();
                    }

                    // Condicional para aceptar únicamente un punto
                    if (caracter == '.' && txtfld.getText().contains(".")) {
                        e.consume();
                    }
                }

            });
        }
    }

    public static void justNumbers(JTextField j1, JTextField j2) {

        // Array de JTextFields
        JTextField[] txtflds = {
            j1,
            j2
        };

        for (JTextField txtfld : txtflds) {

            txtfld.addKeyListener(new KeyAdapter() {

                @Override
                public void keyTyped(KeyEvent e) {

                    char caracter = e.getKeyChar();

                    if ((caracter > '9') && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.')) {
                        e.consume();
                    }

                    if (caracter == '.' && txtfld.getText().contains(".")) {
                        e.consume();
                    } else if (caracter == '-' && txtfld.getText().contains("-")) {
                        e.consume();
                    }
                }

            });
        }
    }
}
