package ValidadorDeDatos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese texto para verificar si es una cadena de numeros");
        String texto = lector.nextLine();

        System.out.println("Validacion de la cadena de texto -" + texto + "- :" + validadorDatos.esNumeroEntero(texto));

        System.out.println("Ingrese un numero");
        int numero = lector.nextInt();
        System.out.println("Ingrese el numero minimo del rango");
        int rango1 = lector.nextInt();
        System.out.println("Ingrese el numero maximo del rango");
        int rango2 = lector.nextInt();

        System.out.println("El numero " + numero + " esta dentro del rango de [" + rango1 + "," + rango2 + "] :" + validadorDatos.estaEnRango(numero, rango1, rango2));
    }
}

