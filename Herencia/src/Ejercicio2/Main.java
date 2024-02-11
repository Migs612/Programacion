package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Estudiante primero = new Estudiante(JOptionPane.showInputDialog("Que estas estudiando?"));

        JOptionPane.showMessageDialog(null, "Datos del primer estudiante" + "\n" + "Su nombre es " + primero.getNombre() + "\n" + "Tiene " + primero.getEdad() + " años" + "\n" + "Esta estudiando " + primero.getCarrera());
    }
}
