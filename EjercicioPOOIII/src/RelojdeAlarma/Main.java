package RelojdeAlarma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        RelojdeAlarma Casio = new RelojdeAlarma();

        System.out.println("Hora actual :");
        System.out.println(Casio.getHoraActual());

        System.out.println("Quieres activar una alarma?");
        String activar = lector.nextLine();
        boolean alarmaActiva;

        if (activar.equalsIgnoreCase("Si")) {
            alarmaActiva = true;
            Casio.setAlarmaActiva(  alarmaActiva);
            System.out.println("Ingrese la hora de la alarma (formato HH:mm): ");
            String horaAlarma = lector.nextLine();

            String[] partes = horaAlarma.split(":");

            if (partes.length == 2) {
                try {
                    int hora = Integer.parseInt(partes[0]);
                    int minutos = Integer.parseInt(partes[1]);
                    Casio.setHoraAlarma(hora, minutos);
                } catch (NumberFormatException e) {
                    System.out.println("Formato incorrecto. Ingrese la hora de la alarma en el formato correcto.");
                }
            } else {
                System.out.println("Formato incorrecto. Ingrese la hora de la alarma en el formato correcto.");
            }
        } else if (activar.equalsIgnoreCase("No")) {
            System.out.println("Esta bien, disfrute el dia");
        }
    }
}
