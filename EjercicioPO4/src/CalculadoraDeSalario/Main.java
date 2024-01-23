package CalculadoraDeSalario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        calculadoraDeSalario linkia = new calculadoraDeSalario();

        for (int i = 0; i < 5; i++) {
            linkia.setNombre(JOptionPane.showInputDialog("Como te llamas?"), i);
            linkia.setHorasTrabajadas(Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas has trabajado?")), i);
            linkia.setSalario(i);
        }

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(
                    null,
                    linkia.mostrarInformacionTrabajador(i)
            );
        }
    }
}
