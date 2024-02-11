package Ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Automovil renault = new Automovil(JOptionPane.showInputDialog("Que marca es?"), JOptionPane.showInputDialog("Que modelo es?"), Integer.parseInt(JOptionPane.showInputDialog("De que año es?")), JOptionPane.showInputDialog("Que tipo de combustible"));

        JOptionPane.showMessageDialog(null, "La marca es :" + renault.getMarca() + "\n"
                + "El modelo es :" + renault.getModelo() + "\n"
                + "Es del año :" + renault.getAno() + "\n"
                + "Su combustible es :" + renault.getTipoDeCombustible());
    }
}
