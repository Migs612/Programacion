package Reloj;

public class Main {
    public static void main(String[] args) {
        Reloj Casio = new Reloj();

        if (Casio.digital) {
            System.out.println("El reloj es digital y su precio es "+Casio.precio+"$");
        }
    }
}
