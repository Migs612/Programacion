package ReservasdeHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Habitacion {
    private int numero;
    private String nombreHuesped;
    private boolean ocupada;
    private String tipo;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.ocupada = false;
        this.nombreHuesped = "";
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public boolean getOcupada() {
        return ocupada;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public String getTipo() {
        return tipo;
    }

    public void reservar(String nombreHuesped) {
        this.ocupada = true;
        this.nombreHuesped = nombreHuesped;
    }

    public void cancelarReserva() {
        this.ocupada = false;
        this.nombreHuesped = "";
    }
}

class Hotel {
    private ArrayList<Habitacion> habitaciones;

    public Hotel(int numHabitaciones) {
        habitaciones = new ArrayList<>();

        for (int i = 1; i <= numHabitaciones; i++) {
            if (i <= 50) {
                habitaciones.add(new Habitacion(i, "Simple"));
            } else if (i <= 90) {
                habitaciones.add(new Habitacion(i, "Doble"));
            } else {
                habitaciones.add(new Habitacion(i, "Suite"));
            }
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("Estado de las habitaciones:");

        for (Habitacion habitacion : habitaciones) /* int i = 0; i < habitaciones.size(); i++ */ {
            System.out.println("Habitación " + habitacion.getNumero() +
                    " - Tipo: " + habitacion.getTipo() +
                    " - Estado: " + (habitacion.getOcupada() ? "Ocupada" : "Libre") +
                    (habitacion.getOcupada() ? " - Huesped: " + habitacion.getNombreHuesped() : "") + "\t");
        }
    }

    public void realizarReserva() {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el numero de habitacion que desea (1-100): ");
        int numHabitacion = lector.nextInt();

        if (numHabitacion < 1 || numHabitacion > 100) {
            System.out.println("Número de habitacion invalido");
            return;
        }

        Habitacion habitacionSeleccionada = habitaciones.get(numHabitacion - 1);

        if (habitacionSeleccionada.getOcupada()) {
            System.out.println("La habitación está ocupada. No se puede reservar.");
        } else {
            System.out.print("Ingrese su nombre: ");
            String nombreHuesped = lector.next();

            habitacionSeleccionada.reservar(nombreHuesped);
            System.out.println("Reserva hecha. ¡Disfrute de su estadía!");
        }
    }

    public void cancelarReserva() {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el numero de habitacion que desea cancelar: ");
        int numHabitacion = lector.nextInt();

        if (numHabitacion < 1 || numHabitacion > 100) {
            System.out.println("Número de habitación incorrecto");
            return;
        }

        Habitacion habitacionSeleccionada = habitaciones.get(numHabitacion - 1);

        if (!habitacionSeleccionada.getOcupada()) {
            System.out.println("La habitación no está ocupada. No se puede cancelar la reserva.");
        } else {
            habitacionSeleccionada.cancelarReserva();
            System.out.println("Reserva cancelada correctamente.");
        }
    }
}
