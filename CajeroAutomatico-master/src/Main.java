import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        String [] id = new String[5];
        String [] contrasena = new String[5];
        int [] saldo = new int[5];
        boolean verificar = false;
        String salida = " ";
        int usuario = 0;

        id[0] = "alejandro.lopez@email.com";
        id[1] = "maria.garcia@email.com";
        id[2] = "juan.perez@email.com";
        id[3] = "carolina.martinez@email.com";
        id[4] = "diego.rodriguez@email.com";

        contrasena[0] = "P@ssw0rd123";
        contrasena[1] = "Secreto789!";
        contrasena[2] = "M1Clav3Segura";
        contrasena[3] = "SeguridadXYZ";
        contrasena[4] = "Contraseña987";

        saldo[0] = 1000;
        saldo[1] = 1503;
        saldo[2] = 2010;
        saldo[3] = 4132;
        saldo[4] = 500;

        System.out.println("Cual es tu correo?");
        String correo = lector.readLine();

        System.out.println("Cual es la contraseña?");
        String contra = lector.readLine();

        for (int i = 0; i < 4; i++){
            if (correo.equals(id[i]) && contra.equals(contrasena[i])){
                System.out.println("Bienvenido");
                verificar = true;
                usuario = i;
            }
        }

        if (!verificar) {
            System.out.println("No eres cliente");
            System.exit(0);
        }

        while (!salida.equals("salir")) {
            System.out.print("1.Retirar  ");
            System.out.print("2.Depositar  ");
            System.out.print("3.Ver saldo  ");
            System.out.print("Salir");
            System.out.println();
            System.out.println("Que accion quieres hacer?");
            salida = lector.readLine();

            switch (salida.toLowerCase()) {
                case "retirar", "1" -> {
                    System.out.println("Cuanto quieres retirar?");
                    int retirar = Integer.parseInt(lector.readLine());
                    if (retirar > saldo[usuario]) {
                        System.out.println("Accion invalida");
                    } else {
                        saldo[usuario] = saldo[usuario] - retirar;
                        System.out.println("Tu nuevo saldo es " + saldo[usuario]);
                    }
                }
                case "repositar", "2" -> {
                    System.out.println("Cuanto quieres depositar?");
                    int depositar = Integer.parseInt(lector.readLine());
                    saldo[usuario] = saldo[usuario] + depositar;
                    System.out.println("Tu nuevo saldo es " + saldo[usuario]);
                }
                case "ver saldo", "3" -> System.out.println("Tu saldo actual es " + saldo[usuario]);
                case "salir" -> System.out.println("Que tenga buena tarde.");
                default -> System.out.println("Accion no Valida");
            }
        }

    }
}