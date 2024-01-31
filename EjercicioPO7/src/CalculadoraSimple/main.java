package CalculadoraSimple;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Dime que quieres hacer?");
        String opcion = lector.nextLine().toLowerCase();

        switch (opcion) {
            case "sumar" -> {
                calculadoraSimple.pedirNumeros();
                System.out.println(calculadoraSimple.suma());
            }
            case "restar" -> {
                calculadoraSimple.pedirNumeros();
                System.out.println(calculadoraSimple.resta());
            }
            case "multiplicar" -> {
                calculadoraSimple.pedirNumeros();
                System.out.println("El resultado es" + calculadoraSimple.multiplicar());
            }
            case "dividir" -> {
                calculadoraSimple.pedirNumeros();
                System.out.println(calculadoraSimple.dividr());
            }
            default -> System.out.println("Pon una opcion correcta");
        }
    }
}
