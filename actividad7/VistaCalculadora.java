package actividad7;
import javax.swing.*;
import java.awt.*;
public class VistaCalculadora extends JFrame {
    public JTextField campoNumero1 = new JTextField(10);
    public JTextField campoNumero2 = new JTextField(10);
    public JTextField campoResultado = new JTextField(15);

    public JButton botonSumar = new JButton("Sumar");
    public JButton botonRestar = new JButton("Restar");
    public JButton botonMultiplicar = new JButton("Multiplicar");
    public JButton botonDividir = new JButton("Dividir");
    public JButton botonLimpiar = new JButton("Limpiar");


    public VistaCalculadora(String nombreUsuario) {
        setTitle("Calculadora - Usuario: " + nombreUsuario);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Número 1:"));
        add(campoNumero1);

        add(new JLabel("Número 2:"));
        add(campoNumero2);

        add(botonSumar);
        add(botonRestar);

        add(botonMultiplicar);
        add(botonDividir);

        add(new JLabel("Resultado:"));
        campoResultado.setEditable(false);
        add(campoResultado);

        setVisible(true);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}