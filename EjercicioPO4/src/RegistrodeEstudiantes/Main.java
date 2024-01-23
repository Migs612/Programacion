package RegistrodeEstudiantes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        registroDeEstudiantes linkia = new registroDeEstudiantes();

        for (int i = 0; i < 3; i++) {
            linkia.setNombre(JOptionPane.showInputDialog("Como te llamas?"), i);
            linkia.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Cuantos años tienes?")),i);
            linkia.setGrado(JOptionPane.showInputDialog("En que grado estas?"),i);
        }

        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(
                    null,
                    linkia.mostrarInformacionEstudiante(i)
            );
        }
    }
}
