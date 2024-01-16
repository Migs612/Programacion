package Automovil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        /*
        Objetivo: Crear una clase Automovil con dos propiedades privadas: marca (String) y modelo
        (String). Implementa los métodos getter y setter para estas propiedades.
        Desafío adicional: Asegúrate de que el modelo no sea nulo ni esté vacío en el setter
         */
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Automovil audi = new Automovil();

        System.out.println("Tu coche actual es :");
        System.out.println(audi.getMarca());
        System.out.println(audi.getModelo());

        try {
            System.out.println("Que marca quieres?");
            String nuevaMarca = lector.readLine();

            if (nuevaMarca != null && !nuevaMarca.isEmpty() && nuevaMarca.matches("^[a-zA-Z\\s]+$")) {
                audi.setMarca(nuevaMarca);
            } else if (nuevaMarca != null && !nuevaMarca.isEmpty() && !nuevaMarca.matches("^[a-zA-Z\\s]+$")) {
                System.out.println("Debe ser una marca real.");
                return;
            } else {
                System.out.println("El modelo no puede ser nulo ni vacío.");
                return;
            }

            System.out.println("Que modelo quieres?");
            String nuevoModelo = lector.readLine();

            if (nuevoModelo != null && !nuevoModelo.isEmpty() && nuevoModelo.matches("^[a-zA-Z\\s]+$")) {
                audi.setModelo(nuevoModelo);
            } else {
                System.out.println("El modelo no puede ser nulo ni vacío.");
                return;
            }

            System.out.println(audi.nuevoAutomovil());
        } catch (IOException e) {
            System.out.println("Error al leer la entrada del usuario: " + e.getMessage());
        }
    }
}
