package ConversionDeUnidades;

import java.util.Scanner;

public class conversionUnidades {
    static Scanner lector = new Scanner(System.in);

    public static double medidas;

    public static double grados;

    public static void transformarMillas() {
        System.out.println("Cuantas millas quieres cambiar a kilometros?");
        conversionUnidades.medidas = lector.nextInt();

        conversionUnidades.medidas = conversionUnidades.medidas * 1.609;

        System.out.println("Kilometros : " + conversionUnidades.medidas);
    }

    public static void transformarKilometros() {
        System.out.println("Cuantos kilometros quieres cambiar a millas?");
        conversionUnidades.medidas = lector.nextInt();

        conversionUnidades.medidas = conversionUnidades.medidas / 1.609;

        System.out.println("Millas : " + conversionUnidades.medidas);
    }

    public static void transformarCelsius() {
        System.out.println("Cuantos grados Celsius quieres transformar a Fahrenheit?");
        conversionUnidades.grados = lector.nextDouble();

        conversionUnidades.grados = (conversionUnidades.grados * 1.8) + 32;

        System.out.println("Grados Fahrenheit : " + conversionUnidades.grados);
    }

    public static void transformarFahrenheit() {
        System.out.println("Cuantos grados Fahrenheit quieres transformar a Celsius?");
        conversionUnidades.grados = lector.nextDouble();

        conversionUnidades.grados = (conversionUnidades.grados - 32) * 0.5555555555555556;

        System.out.println("Grados Fahrenheit : " + conversionUnidades.grados);
    }
}
