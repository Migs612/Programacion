package ComprobadorDeEdad;

import javax.swing.*;

public class Comprobador {
    private final int comprobarEdad;
    private int edadUsuario;

    public Comprobador() {
        this.comprobarEdad = 18;
    }

    public void pedirEdadUsuario(int edad) {
        this.edadUsuario = edad;
    }

    public void comprobar(){
        if (this.edadUsuario >= comprobarEdad) {
            JOptionPane.showMessageDialog(null,"Puedes votar campeon");
        } else if (this.edadUsuario == comprobarEdad-1) {
            JOptionPane.showMessageDialog(null,"Que pena, tendras que esperar un año");
        } else {
            JOptionPane.showMessageDialog(null,"No puedes votar");
        }
    }

}
