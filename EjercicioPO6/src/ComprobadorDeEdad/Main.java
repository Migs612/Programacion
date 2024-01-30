package ComprobadorDeEdad;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Comprobador edadVotar = new Comprobador();

        edadVotar.pedirEdadUsuario(Integer.parseInt(JOptionPane.showInputDialog("Cuantos años tienes?")));

        edadVotar.comprobar();

    }
}
