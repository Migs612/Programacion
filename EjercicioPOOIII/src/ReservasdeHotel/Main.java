package ReservasdeHotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(100);
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar disponibilidad");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    hotel.mostrarDisponibilidad();
                    break;
                case 2:
                    hotel.realizarReserva();
                    break;
                case 3:
                    hotel.cancelarReserva();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar nuestro sistema de reservas!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        } while (opcion != 0);
    }
}