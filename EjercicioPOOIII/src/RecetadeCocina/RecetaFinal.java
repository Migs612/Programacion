package RecetadeCocina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RecetaFinal {
    private String nombreReceta;
    private int numeroIngredientes;
    private String[] ingredientes;
    private int numeroPasosReceta;
    private String[] pasosReceta;

    public RecetaFinal() {
        nombreReceta = " ";
        numeroIngredientes = 0;
        numeroPasosReceta = 0;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombre) {
        this.nombreReceta = nombre;
    }

    public void setIngredientes(String[] ingredientes) {
        this.numeroIngredientes = ingredientes.length;
        this.ingredientes = new String[numeroIngredientes];

        for (int i = 0; i < numeroIngredientes; i++) {
            this.ingredientes[i] = ingredientes[i].trim();
        }
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setPasosReceta(int numeroPasosReceta) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        this.pasosReceta = new String[numeroPasosReceta];
        this.numeroPasosReceta = numeroPasosReceta;
        for (int i = 0; i < numeroPasosReceta; i++) {
            System.out.println("Dime el paso nº" + (i + 1));
            this.pasosReceta[i] = lector.readLine();
        }
    }

    public String[] getPasosReceta() {
        return pasosReceta;
    }

    public static void verReceta(RecetaFinal receta) {
        System.out.println("\nReceta:");
        System.out.println("Nombre: " + receta.getNombreReceta());

        String[] ingredientes = receta.getIngredientes();
        System.out.println("\nIngredientes:");
        for (String ingrediente : ingredientes) {
            System.out.print(" - " + ingrediente);
        }

        String[] pasos = receta.getPasosReceta();
        System.out.println("\nPasos:");
        for (int i = 0; i < pasos.length; i++) {
            System.out.println((i + 1) + ". " + pasos[i]);
        }
    }

    public static void eliminarIngrediente(RecetaFinal receta, BufferedReader lector) throws IOException {
        System.out.println("\nIngredientes actuales:");
        String[] ingredientesActuales = receta.getIngredientes();
        for (int i = 0; i < ingredientesActuales.length; i++) {
            System.out.println((i + 1) + ". " + ingredientesActuales[i]);
        }

        System.out.println("Ingrese el número del ingrediente que desea eliminar:");
        int numeroEliminarIngrediente = Integer.parseInt(lector.readLine()) - 1;

        receta.eliminarIngrediente(numeroEliminarIngrediente);

        System.out.println("Ingredientes actualizados:");
        String[] nuevosIngredientes = receta.getIngredientes();
        for (int i = 0; i < nuevosIngredientes.length; i++) {
            System.out.println((i + 1) + ". " + nuevosIngredientes[i]);
        }
    }

    public void eliminarIngrediente(int indice) {
        if (indice >= 0 && indice < numeroIngredientes) {
            String[] nuevosIngredientes = new String[numeroIngredientes - 1];
            int contador = 0;

            for (int i = 0; i < numeroIngredientes; i++) {
                if (i != indice) {
                    nuevosIngredientes[contador++] = ingredientes[i];
                }
            }

            Arrays.sort(nuevosIngredientes);
            this.ingredientes = nuevosIngredientes;
            this.numeroIngredientes = nuevosIngredientes.length;
        } else {
            System.out.println("Índice de ingrediente no válido.");
        }
    }

    public static void eliminarPasoReceta(RecetaFinal receta) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Pasos actuales:");
        String[] pasosActuales = receta.getPasosReceta();
        for (int i = 0; i < pasosActuales.length; i++) {
            System.out.println((i + 1) + ". " + pasosActuales[i]);
        }

        System.out.println("Ingrese el número del paso que desea eliminar:");
        int numeroEliminarPaso = Integer.parseInt(lector.readLine()) - 1;

        receta.eliminarPaso(numeroEliminarPaso);

        System.out.println("Pasos actualizados:");
        String[] nuevosPasos = receta.getPasosReceta();
        for (int i = 0; i < nuevosPasos.length; i++) {
            System.out.println((i + 1) + ". " + nuevosPasos[i]);
        }
    }

    public void eliminarPaso(int indice) {
        if (indice >= 0 && indice < numeroPasosReceta) {
            String[] nuevosPasos = new String[numeroPasosReceta - 1];
            int contador = 0;

            for (int i = 0; i < numeroPasosReceta; i++) {
                if (i != indice) {
                    nuevosPasos[contador++] = pasosReceta[i];
                }
            }

            this.pasosReceta = nuevosPasos;
            this.numeroPasosReceta = nuevosPasos.length;
        } else {
            System.out.println("Índice de paso no válido.");
        }
    }
}
