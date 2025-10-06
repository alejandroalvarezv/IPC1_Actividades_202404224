package actividad7;
import Model.Usuario;
import Model.Actividad7;
import Controlador.ControladorCalculadora;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");
        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
            nombreUsuario = "Invitado";
        }

        Actividad7 modelo = new Actividad7();
        Usuario usuario = new Usuario(nombreUsuario);
        VistaCalculadora vista = new VistaCalculadora(nombreUsuario);

        new ControladorCalculadora(modelo, usuario, vista);
    }
}