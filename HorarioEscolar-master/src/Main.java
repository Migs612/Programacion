import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        /*System.out.println("Cuantas clases tienes?");
        int clases = Integer.parseInt(lector.readLine());

        System.out.println("Cuantos profesores tienes y como se llaman?");
        int numprofesores = Integer.parseInt(lector.readLine());

        String [] profesores = new String[numprofesores];

        for (int i = 0; i < numprofesores; i++) {
            System.out.println("Como se llama el profesor numero "+i);
            profesores[i] = lector.readLine();
        }

        System.out.println("Cuantas aulas hay disponibles");
        int aulasdispo = Integer.parseInt(lector.readLine());

        for (int i = 1; i < horario.length; i++) {
            for (int j = 1; j < horario[i].length; j++) {
                System.out.print("Ingrese la clase para el horario " + horario[i][0] + " en " + horario[0][j] + ": ");
                horario[i][j] = lector.readLine();
            }
        }
        */

        String[][] horario = {
                {"Horario", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"},
                {"08:30 - 09:20", "Matematicas", "Lengia", "Fisica", "Quimica", "No se"},
                {"09:20 - 10:10", "Musica", "Religion", "TIC", "Magia Borras", "Programacion"},
                {"10:10 - 11:00", "Sistemas", "Lenguaje de Marcas", "ME ABURRRO", "Porfavor", "alvSe mamo"},
                {"11:00 - 11:30", "P", "A", "T", "I", "O"},
                {"11:30 - 12:20", "matematicas", "Maatematicas", "Lengua", "Matematicas", "Lengua"},
                {"12:20 - 13:10", "Fisica", "Quimica", "Matematicas", "Lengua", "Quimia"},
                {"13:10 - 14:00", "Biologia", "Programacion", "Patataon", "No se que poner", "Pedro cagon"}
        };

        int[] maxLengths = new int[horario[0].length];
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                maxLengths[j] = Math.max(maxLengths[j], horario[i][j].length() + 2);
            }
        }

        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                System.out.print(padRight(horario[i][j], maxLengths[j]));
            }
            System.out.println();
        }
    }

    private static String padRight(String s, int length) {
        return String.format("%-" + length + "s", s);
    }
}

