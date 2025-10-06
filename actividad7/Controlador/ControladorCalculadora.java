package Controlador;
import Model.Actividad7;
import Model.Usuario;
import actividad7.VistaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora {

    private Actividad7 modelo;
    private Usuario usuario;
    private VistaCalculadora vista;

    public ControladorCalculadora(Actividad7 modelo, Usuario usuario, VistaCalculadora vista) {
        this.modelo = modelo;
        this.usuario = usuario;
        this.vista = vista;

        this.vista.botonSumar.addActionListener(new OperacionListener("sumar"));
        this.vista.botonRestar.addActionListener(new OperacionListener("restar"));
        this.vista.botonMultiplicar.addActionListener(new OperacionListener("multiplicar"));
        this.vista.botonDividir.addActionListener(new OperacionListener("dividir"));
    }

    private class OperacionListener implements ActionListener {
        private String operacion;

        public OperacionListener(String operacion) {
            this.operacion = operacion;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(vista.campoNumero1.getText());
                double num2 = Double.parseDouble(vista.campoNumero2.getText());
                double resultado = 0;

                switch (operacion) {
                    case "sumar":
                        resultado = modelo.sumar(num1, num2);
                        break;
                    case "restar":
                        resultado = modelo.restar(num1, num2);
                        break;
                    case "multiplicar":
                        resultado = modelo.multiplicar(num1, num2);
                        break;
                    case "dividir":
                        resultado = modelo.dividir(num1, num2);
                        break;
                }

                vista.campoResultado.setText(String.valueOf(resultado));
                System.out.println("Usuario " + usuario.getNombre() + " realizo: " + operacion + " -> Resultado: " + resultado);

            } catch (NumberFormatException ex) {
                vista.mostrarMensaje("Por favor, ingresa números válidos.");
            } catch (ArithmeticException ex) {
                vista.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }
}