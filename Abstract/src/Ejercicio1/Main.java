package Ejercicio1;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Figura RecoCir = elegirFigura();
        RecoCir.calcularArea();
    }

    public static Figura elegirFigura() {
        Object[] figuras = {"Rectangulo", "Circulo"};

        int opcion = JOptionPane.showOptionDialog(null, "Que area quieres calcular?", "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, figuras, figuras[0]);

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

abstract class Figura {
    public void calcularArea() {}
}

class Rectangulo extends Figura {

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public void calcularArea() {
        double area = largo * ancho;
        DecimalFormat df = new DecimalFormat("#.##");
        String area2 = df.format(area);
        JOptionPane.showMessageDialog(null,"El area del rectangulo es "+ area2);
    }
}

class Circulo extends Figura {
    double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area = Math.PI * radio * radio;
        DecimalFormat df = new DecimalFormat("#.##");
        String area2 = df.format(area);
        JOptionPane.showMessageDialog(null,"El area del circulo es "+ area2);
    }
}
