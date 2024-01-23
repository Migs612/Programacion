package agendaDeContactos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lector.nextInt();

        } while (!(opcion == 0));
    }
}
