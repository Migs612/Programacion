package ConversionDeUnidades;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Que cambio quieres hacer?");
        String opcion = lector.nextLine().toLowerCase();

        switch (opcion) {
            case "distancia" -> {
                System.out.println("Tienes millas o kilometros?");
                opcion = lector.nextLine().toLowerCase();
                if (opcion.equalsIgnoreCase("Millas")) {
                    conversionUnidades.transformarMillas();
                } else if (opcion.equalsIgnoreCase("Kilometros")) {
                    conversionUnidades.transformarKilometros();
                }
            }
            case "temperatura" -> {
                System.out.println("Tienes grados Celsius o grados Fahrenheit?");
                opcion = lector.nextLine().toLowerCase();
                if (opcion.equalsIgnoreCase("Celsius")) {
                    conversionUnidades.transformarCelsius();
                } else if (opcion.equalsIgnoreCase("Fahrenheit")) {
                    conversionUnidades.transformarFahrenheit();
                }
            }
        }
    }
}
