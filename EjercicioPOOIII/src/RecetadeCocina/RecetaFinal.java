package RecetadeCocina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecetaFinal {
    String nombreReceta;
    int numeroIngredientes;
    String [] ingredientes;
    int numeroPasosReceta;
    String [] pasosReceta;

    public RecetaFinal() {
        nombreReceta = " ";
        numeroIngredientes = 0;
        numeroPasosReceta = 0;
    }

    public void setNombreReceta(String nombre) {
        this.nombreReceta = nombre;
    }

    public void setIngredientes(String[] ingredientes) {
        this.numeroIngredientes = ingredientes.length;
        this.ingredientes = new String[numeroIngredientes];

        for (int i = 0; i < numeroIngredientes; i++) {
            this.ingredientes[i] = ingredientes[i].trim();
        }
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setPasosReceta(int numeroPasosReceta) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        this.pasosReceta = new String[numeroPasosReceta];
        this.numeroPasosReceta = numeroPasosReceta;
        for (int i = 0; i < numeroPasosReceta; i++) {
            System.out.println("Dime el paso nº"+(i+1));
            this.pasosReceta[i] = lector.readLine();
        }
    }

    public String[] getPasosReceta() {
        return pasosReceta;
    }
}
