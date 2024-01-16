package Automovil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Automovil audi = new Automovil();

        System.out.println(audi.getMarca());
        System.out.println(audi.getModelo());

        System.out.println("Que marca quieres?");
        String nuevaMarca = lector.readLine();
        audi.setMarca(nuevaMarca);

        System.out.println("Que modelo quieres?");
        String nuevoModelo = lector.readLine();
        audi.setModelo(nuevoModelo);

        System.out.println(audi.nuevoAutomovil());
    }
}
