package Ejercicio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Figura RecoCir = elegirFigura();
        RecoCir.calcularArea();
    }

    public static Figura elegirFigura() {
        Object[] figuras = {"Rectangulo", "Circulo"};

        int opcion = JOptionPane.showOptionDialog(null, "Cual es tu animal favorito?", "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, figuras, figuras[0]);

        if (opcion == JOptionPane.YES_OPTION) {
            double largo = Double.parseDouble(JOptionPane.showInputDialog("Cual es el largo del rectangulo?"));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog("Cual es el ancho del rectangulo?"));

            return new Rectangulo(largo,ancho);

        } else if (opcion == JOptionPane.NO_OPTION) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Cual es el radio?"));
            return new Circulo(radio);
        } else {
            System.out.println("No elegiste nada >:(");
            return null;
        }
    }
}
