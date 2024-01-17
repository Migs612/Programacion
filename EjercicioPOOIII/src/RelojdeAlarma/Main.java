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

        if (activar.equalsIgnoreCase("Si")) {
            Casio.setAlarmaActiva(true);
            System.out.println("Ingrese la hora de la alarma (formato HH:mm): ");
            String horaAlarma = lector.nextLine();

            String[] partes = horaAlarma.split(":");

            if (partes.length == 2) {
                try {
                    int hora = Integer.parseInt(partes[0]);
                    int minutos = Integer.parseInt(partes[1]);
                    Casio.setHoraAlarma(hora, minutos);
                    Casio.setHoraActual();
                } catch (NumberFormatException e) {
                    System.out.println("Pon una hora correcta");
                }
            } else {
                System.out.println("Pon una hora correcta");
            }
        } else if (activar.equalsIgnoreCase("No")) {
            System.out.println("Esta bien, disfrute el dia");
        }

        System.out.println("Alarma configurada a las "+Casio.getHoraAlarma());

        System.out.println("Estas seguro que quieres tener esta alarma?");
        activar = lector.nextLine();

        if (activar.equalsIgnoreCase("Si")){
            System.out.println("Perfecto, te avisare cuando sea la hora");
        } else if (activar.equalsIgnoreCase("No")) {
            System.out.println("Es una pena, me despido");
            System.exit(0);
        }

        if (Casio.getAlarmaActiva() && Casio.compararHoras()) {
            System.out.println("Alarma sonando.");
        } else {
            System.out.println("Todavia no es tu hora.");
        }
    }
}
