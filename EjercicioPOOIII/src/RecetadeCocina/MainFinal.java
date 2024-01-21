package RecetadeCocina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainFinal {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        RecetaFinal receta = new RecetaFinal();

        System.out.println("Buenas, vamos a apuntar esa receta.");
        System.out.println("Como se llama la receta que me vas a decir?");
        String nombre = lector.readLine();
        receta.setNombreReceta(nombre);

        System.out.println("Lo siguiente que haremos es añadir los ingredientes");
        System.out.println("Cuantos ingredientes tiene?");
        int numIngredientes = Integer.parseInt(lector.readLine());

        System.out.println("Dime los ingredientes seguidos de una coma.");
        String ingredientes = lector.readLine();

        String[] numeroIn = ingredientes.split(",");
        for (int i = 0; i < numeroIn.length; i++) {
            numeroIn[i] = numeroIn[i].trim();
        }

        int numeroINgre = numeroIn.length;

        if (numeroINgre == numIngredientes) {
            receta.setIngredientes(numeroIn);

            String[] ingredientesReceta = receta.getIngredientes();

            System.out.println("Ingredientes de la receta:");
            for (String ingrediente : ingredientesReceta) {
                System.out.print(" - " + ingrediente);
            }
        } else {
            System.out.println("La cantidad de ingredientes no coincide");
        }

        System.out.println("\nCuantos pasos tiene la receta?");
        int numeroPasosReceta = Integer.parseInt(lector.readLine());


        receta.setPasosReceta(numeroPasosReceta);

        String[] pasosDeReceta = receta.getPasosReceta();

        System.out.println("\nPasos de la receta:");
        for (int i = 0; i < pasosDeReceta.length; i++) {
            System.out.println((i + 1) + ". " + pasosDeReceta[i]);
        }

        int opcion;
        do {
            System.out.println("\nQue quieres hacer ahora?");
            System.out.println("1. Ver receta final");
            System.out.println("2. Eliminar ingrediente");
            System.out.println("3. Eliminar paso");

            opcion = Integer.parseInt(lector.readLine());

            switch (opcion) {
                case 1:
                    RecetaFinal.verReceta(receta);
                    break;
                case 2:
                    RecetaFinal.eliminarIngrediente(receta, lector);
                    break;
                case 3:
                    RecetaFinal.eliminarPasoReceta(receta);
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 1);
    }
}

