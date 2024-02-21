package Ejercicio1;

import Utiles.Persona;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(25, "angel"));
        lista.add(new Persona(25, "maria"));
        lista.add(new Persona(25 ,"miguel"));
        lista.add(new Persona(25,"mata"));
        lista.add(new Persona(25,"jose manuel"));

        for (Persona p : lista) System.out.println(p);
    }
}
