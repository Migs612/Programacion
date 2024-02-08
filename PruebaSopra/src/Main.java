import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = lector.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
            restarNumero(numero);
        } else {
            System.out.println("El numero es impar");
            restarNumero(numero);
        }
    }

    public static void restarNumero(int num) {
        System.out.println(num);
        for (int i = 0; i < num*2;i++) {
            num = num - 2;
            System.out.println(num);
        }
    }
}