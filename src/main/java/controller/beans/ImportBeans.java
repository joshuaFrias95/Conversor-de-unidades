package controller.beans;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

            File file = new File(url);
            BufferedImage bufferedImage = ImageIO.read(file);

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

            File file = new File(url);
            BufferedImage bufferedImage = ImageIO.read(file);

            ImageIcon imageIcon = new ImageIcon(bufferedImage);

            btn.setIcon(imageIcon);
        } catch (IOException e) {

            System.out.println("No pudo cargarse la imagen");

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
