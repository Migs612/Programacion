package CalculadoraSimple;

import java.util.Scanner;

public class calculadoraSimple {
    static Scanner lector = new Scanner(System.in);
    private static double numero1;
    private static double numero2;

    public static void pedirNumeros() {
        System.out.println("Con que numeros quieres realizar la operacion");
        System.out.println("Numero 1");
        numero1 = lector.nextDouble();
        System.out.println("Numero 2");
        numero2 = lector.nextDouble();
    }
    public static double suma() {
        return numero1 + numero2;
    }

    public static double resta() {
        return numero1 - numero2;
    }

    public static double multiplicar() {
        return numero1 * numero2;
    }

    public static double dividr() {
        return numero1 / numero2;
    }
}
