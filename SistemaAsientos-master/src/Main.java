import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner lector = new Scanner(System.in);
        BufferedReader lector2 = new BufferedReader(new InputStreamReader(System.in));

        String repetir = " ";

        String [][] asientos = new String[10][10];
        String [][] verificarasientos = new String [10][10];
        int asiento = 1;
        int verificarasiento = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                asientos[i][j] = String.valueOf(asiento++);
                verificarasientos[i][j] = String.valueOf(verificarasiento++);
            }
        }

        do {
            try {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print(asientos[i][j] + " ");
                    }
                    System.out.println();
                }

                int numeroAsiento;

                do {
                    try {
                        System.out.println("¿Qué número de asiento quieres? (1-100)");
                        numeroAsiento = lector.nextInt();
                        lector.nextLine();

                        if (numeroAsiento < 1 || numeroAsiento > 100) {
                            System.out.println("Dime un número válido de asiento (1-100)");
                            numeroAsiento = lector.nextInt();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa un número válido");
                        lector.nextLine();
                        numeroAsiento = 0;
                    }
                } while (numeroAsiento < 1 || numeroAsiento > 100);

                boolean asientoOcupado = false;

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (verificarasientos[i][j].equals(String.valueOf(numeroAsiento))) {
                            if (!asientos[i][j].equals("Ocupado")) {
                                asientos[i][j] = "Ocupado";
                                System.out.println("Toma la entrada");

                                for (int k = 0; k < 10; k++) {
                                    for (int l = 0; l < 10; l++) {
                                        System.out.print(asientos[k][l] + " ");
                                    }
                                    System.out.println();
                                }
                            } else {
                                System.out.println("Esta ocupado, no puedes comprar esta entrada");
                            }
                        }
                    }
                }

                if (!asientoOcupado) {
                    boolean validar = false;

                    do {
                        try {
                            System.out.println("¿Quieres otra entrada? (Si/No)");
                            repetir = lector2.readLine();

                            if (repetir.trim().equalsIgnoreCase("Si") || repetir.trim().toLowerCase().startsWith("si")) {
                                System.out.println("Me alegro, estos son los asientos disponibles");
                                validar = true;
                            } else if (repetir.trim().equalsIgnoreCase("No") || repetir.trim().toLowerCase().startsWith("no")) {
                                System.out.println("Que disfrute la pelicula");
                                validar = true;
                            } else if (!(repetir.trim().equalsIgnoreCase("No") || repetir.trim().toLowerCase().startsWith("no"))) {
                                System.out.println("Respuesta invalida, repite por favor");
                                lector.nextLine();
                            }
                        } catch (IOException e) {
                            System.out.println("Caracter inválido. Intentelo más tarde");
                            System.exit(0);
                        }
                    } while (!validar);
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } while (repetir.trim().equalsIgnoreCase("Si") || repetir.trim().toLowerCase().startsWith("si"));

        lector.close();
        lector2.close();
    }
}
