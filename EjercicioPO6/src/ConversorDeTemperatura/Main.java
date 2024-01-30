package ConversorDeTemperatura;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Conversor Fahrenheit = new Conversor();

        Fahrenheit.obtenerCelsius(Integer.parseInt(JOptionPane.showInputDialog("A cuanto grados estas?")));

        JOptionPane.showMessageDialog(null, Fahrenheit.darCelsius() + " Celsius en Fahrenheit es " + Fahrenheit.convertirCelsius() + " grados");

    }
}


