
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class ResultadoFrame extends JFrame {

    public ResultadoFrame(String resultado) {
        super("Resultado");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Resultado: " + resultado);
        add(label);
        
        setVisible(true);
    }
}
