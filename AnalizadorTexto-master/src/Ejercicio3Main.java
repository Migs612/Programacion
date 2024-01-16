import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3Main {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese texto");
        String frase = lector.readLine();

        String [] palabras = frase.toLowerCase().split(" ");

        int numeropalabras = palabras.length;

        int longitudpra = 0;

        for (int i = 0; i < palabras.length; i++) {
            longitudpra += palabras[i].length();
        }

        int longitudpro = longitudpra/numeropalabras;

        String palabrasiguales;
        int contadoriguales = 0;

        for (int i = 0; i < palabras.length; i++) {
            palabrasiguales = palabras[i];
            for (int j = 0; j < i; j++) {
                if (palabrasiguales.equals(palabras[j])) {
                    contadoriguales++;
                }
            }
        }

        System.out.println("Tiene "+numeropalabras+" palabras");
        System.out.println("Tiene en total "+longitudpra+" letras");
        System.out.println("La logitud promedio es de "+longitudpro);
        if (contadoriguales == 1) {
            System.out.println("Hay "+contadoriguales+" palabra igual");
        } else {
            System.out.println("Hay "+contadoriguales+" palabras iguales");
        }

    }
}
