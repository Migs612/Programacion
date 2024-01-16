package Estudiante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
    Objetivo: Construye una clase Estudiante con tres propiedades privadas: nombre (String), edad
    (int), y calificacion (double). Implementa los getters y setters correspondientes.
    Desafío adicional: Asegúrate de que la edad sea un número positivo y que la calificación esté
    en el rango de 0 a 100.
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
                } else if (calificacion > 100) {
                    throw new IllegalArgumentException("La calificacion no puede ser mayor a 100");
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
