package CuentaBancaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        Cuentabancaria cuenta = new Cuentabancaria();

        System.out.println("Bienvenido, ingrese tu nombre");
        String Nombre = lector.readLine();
        cuenta.setTitular(Nombre);

        System.out.println(cuenta.getTitular());

        System.out.println("Tu saldo actual es de "+cuenta.getSaldo());

        System.out.println("Dime cuanto quieres ingresar");
        double dinero = Double.parseDouble(lector.readLine());
        cuenta.setSaldo(dinero);

        System.out.println("Tu nuevo saldo es de "+cuenta.getSaldo());

    }
}
