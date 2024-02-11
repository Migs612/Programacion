package Ejercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        AnimalPreferido favorito = new AnimalPreferido();

        Object[] animales = {"perros", "gatos"};

        int opciones = JOptionPane.showOptionDialog(null, "Cual es tu animal favorito?", "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, animales, animales[0]);

        if (opciones == JOptionPane.YES_OPTION) {
            favorito.setTipoAnimal("perros");
        } else if (opciones == JOptionPane.NO_OPTION) {
            favorito.setTipoAnimal("gatos");
        } else {
            System.out.println("No elegiste nada >:(");
        }

        JOptionPane.showMessageDialog(null, favorito.getRuido());
    }
}

