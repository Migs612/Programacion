package Ejercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Animal escoger = elegirAnimal();

        if (escoger instanceof Gato) {
            ((Gato) escoger).setNombre(JOptionPane.showInputDialog("Como se llama el gato?"));
        } else if (escoger instanceof Perro) {
            ((Perro) escoger).setNombre(JOptionPane.showInputDialog("Como se llama el perro?"));
        }

        String[] opciones = {"Saludarle", "Ver a donde se mueve", "Dejarle en paz"};

        while (true) {
            int opcionSeleccionada = JOptionPane.showOptionDialog(null,
                    "Selecciona una acción:",
                    "Menú de acciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    escoger.Sonido();
                    break;
                case 1:
                    escoger.moverse();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Xao " + escoger.getNombre());
                    break;
                default:
                    System.out.println("Opción no reconocida");
            }

            if (opcionSeleccionada == JOptionPane.CLOSED_OPTION || opcionSeleccionada == 2) {
                break;
            }
        }
    }

    public static Animal elegirAnimal() {
        Object[] vehiculos = {"Perro", "Gato"};

        int opcion = JOptionPane.showOptionDialog(null, "Que animal de compañia tienes?", "Selecciona un vehiculo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, vehiculos, vehiculos[0]);

        if (opcion == JOptionPane.YES_OPTION) {
            return new Perro();
        } else if (opcion == JOptionPane.NO_OPTION) {
            return new Gato();
        } else {
            System.out.println("Ningun animal te quiere");
            return null;
        }
    }
}

abstract class Animal {
    public abstract void Sonido();

    public abstract void moverse();

    public abstract void setNombre(String nombre);

    public abstract String getNombre();
}

class Gato extends Animal {
    String nombre;

    public Gato() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void Sonido() {
        JOptionPane.showMessageDialog(null, getNombre() + ": Meoww");
    }

    @Override
    public void moverse() {
        JOptionPane.showMessageDialog(null, getNombre() + " se pira a su cama");
    }
}

class Perro extends Animal {
    String nombre;

    public Perro() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void Sonido() {
        JOptionPane.showMessageDialog(null, getNombre() + ": woof");
    }

    @Override
    public void moverse() {
        JOptionPane.showMessageDialog(null, getNombre() + " se va a por la correa porque quiere que le saques a pasear");
    }
}
