package Estudiante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
    Ejercicio 4: Clase Producto
    Objetivo: Crea una clase Producto con tres propiedades privadas: nombre (String), precio
    (double), y stock (int). Desarrolla los métodos getter y setter necesarios.
    Desafío adicional: En el setter de stock, asegúrate de que no sea un número negativo.
    */

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        Estudiante DAM1 = new Estudiante();

        boolean datosIngresadosCorrectamente = false;

        while (!datosIngresadosCorrectamente) {
            try {
                System.out.println("Ingrese su nombre por favor");
                String nombre = lector.readLine();
                if (!nombre.matches("^[a-zA-Z\\s]+$")) {
                    throw new IllegalArgumentException("El nombre solo puede contener letras y espacios.");
                }
                DAM1.setNombre(nombre);

                System.out.println("Ingrese su edad");
                int edad = Integer.parseInt(lector.readLine());
                if (edad <= 0) {
                    throw new IllegalArgumentException("La edad debe ser un número positivo.");
                }
                DAM1.setEdad(edad);

                System.out.println("Ingrese su nota media");
                double calificacion = Double.parseDouble(lector.readLine());
                if (calificacion < 0) {
                    throw new IllegalArgumentException("La calificación no puede ser un número negativo.");
                }
                DAM1.setCalificacion(calificacion);

                datosIngresadosCorrectamente = true;

                System.out.println("Aquí están tus calificaciones finales, alumno " + DAM1.getNombre());
                System.out.println("Edad: " + DAM1.getEdad());
                System.out.println("Calificación: " + DAM1.getCalificacion());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, ingrese los datos correctamente.");
                System.out.println();
            }
        }
    }
}
