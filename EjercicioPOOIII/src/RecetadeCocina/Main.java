package RecetadeCocina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        RecetadeCocina menu = new RecetadeCocina();

        System.out.println("Que receta quieres hacer?");
        System.out.print("1. Pasta a la carbonara");
        System.out.print("2. Cuscus con aceitunas negras y pasas");
        System.out.println("3. Arroz con pollo al curry");
        String receta = lector.nextLine();

        if (receta.equalsIgnoreCase("1") || receta.equalsIgnoreCase("Pasta a la carbonara")) {
            menu.setCondimentosPasta();
            menu.getCondimentosPasta();
        } else if (receta.equalsIgnoreCase("2") || receta.equalsIgnoreCase("Cuscus con aceitunas negras y pasas")) {
            menu.setCondimentosCuscus();
            menu.getCondimentosCuscus();
        } else if (receta.equalsIgnoreCase("3") || receta.equalsIgnoreCase("Arroz con pollo con curry")) {
            menu.setCondimentosArroz();
            menu.getCondimentosArroz();
        } else {
            System.out.println("Introduzce una receta valida");
        }

        System.out.println("Quieres agregar algun condimento que te guste?");
        String agregarCon = lector.nextLine();

        if (agregarCon.equalsIgnoreCase("Si")) {
            System.out.println("Perfecto, dime cual quieres agregar?");
            String ingredientes = lector.nextLine();
            menu.masIngredientes(ingredientes, receta);
        } else if (agregarCon.equalsIgnoreCase("No")) {
            System.out.println("Esta bien, sigamos con la receta");
        } else {
            System.out.println("No te entendi, inicia de nuevo el programa");
            System.exit(0);
        }
    }
}
