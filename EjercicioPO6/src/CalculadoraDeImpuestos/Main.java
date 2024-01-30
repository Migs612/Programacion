package CalculadoraDeImpuestos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculadora Impuestos = new Calculadora(15);

        Impuestos.ingresarDinero(Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero tienes?")));

        JOptionPane.showMessageDialog(null, "Tienes que pagar " + Impuestos.dineroFinal() + "$");
    }
}
