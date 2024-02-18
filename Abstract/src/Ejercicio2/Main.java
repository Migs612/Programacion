package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculoelegido = elegirVehiculo();
        String[] opciones = {"Acelerar", "Frenar", "Aparcar"};

        while (true) {
            int opcionSeleccionada = JOptionPane.showOptionDialog(null,
                    "Selecciona una acción:",
                    "Menú de acciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    vehiculoelegido.acelerar();
                    break;
                case 1:
                    vehiculoelegido.frenar();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Tenga cuidado donde aparca señor");
                    break;
                default:
                    System.out.println("Opción no reconocida");
            }

            if (opcionSeleccionada == JOptionPane.CLOSED_OPTION || opcionSeleccionada == 2) {
                break;
            }
        }
    }


    public static Vehiculo elegirVehiculo() {
        Object[] vehiculos = {"Coche", "Moto"};

        int opcion = JOptionPane.showOptionDialog(null, "Que vehiculo tienes?", "Selecciona un vehiculo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, vehiculos, vehiculos[0]);

        if (opcion == JOptionPane.YES_OPTION) {
            return new Automovil();
        } else if (opcion == JOptionPane.NO_OPTION) {
            return new Moto();
        } else {
            System.out.println("No tienes ningun vehiculo, p pobre");
            return null;
        }
    }

    static abstract class Vehiculo {

        public abstract void acelerar();

        public abstract void frenar();

    }

    static class Moto extends Vehiculo {
        double velocidad;

        public Moto() {
            super();
            this.velocidad = 0;
        }

        @Override
        public void acelerar() {
            velocidad += 1;
            JOptionPane.showMessageDialog(null, "Velocidad de la moto : " + velocidad + " km/h");
        }

        @Override
        public void frenar() {
            velocidad -= 1;
            JOptionPane.showMessageDialog(null, "Velocidad de la moto : " + velocidad + " km/h");
        }
    }

    static class Automovil extends Vehiculo {
        double velocidad;

        public Automovil() {
            this.velocidad = 0;
        }

        @Override
        public void acelerar() {
            velocidad += 1;
            JOptionPane.showMessageDialog(null, "Velocidad del coche : " + velocidad + " km/h");
        }

        @Override
        public void frenar() {
            velocidad -= 1;
            JOptionPane.showMessageDialog(null, "Velocidad del coche : " + velocidad + " km/h");
        }
    }
}



