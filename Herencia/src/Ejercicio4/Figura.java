package Ejercicio4;

import javax.swing.*;
import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Figura {
    public void calcularArea() {
        System.out.println("Aqui se calculara el area");
    }
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
