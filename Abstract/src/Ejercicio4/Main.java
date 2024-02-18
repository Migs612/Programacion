package Ejercicio4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Persistencia Datos = elegirFormato();

        String[] opciones = {"Guardar datos", "Ver los datos", "Salir"};

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
                    String dato = JOptionPane.showInputDialog("¿Qué quieres guardar?");
                    Datos.guardarDatos(dato);
                    break;
                case 1:
                    if (Datos instanceof basedeDatos) {
                        mostrarDatos(Datos);
                    } else {
                        Datos.cargarDatos();
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    System.out.println("Opción no reconocida");
            }

            if (opcionSeleccionada == JOptionPane.CLOSED_OPTION || opcionSeleccionada == 2) {
                break;
            }
        }
    }

    public static Persistencia elegirFormato() {
        Object[] formato = {"Archivo", "Base de Datos"};

        int opcion = JOptionPane.showOptionDialog(null, "En que formato quieres guardarlo?", "Selecciona un formato", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, formato, formato[0]);
        if (opcion == JOptionPane.YES_OPTION) {
            return new Archivo();
        } else if (opcion == JOptionPane.NO_OPTION) {
            return new basedeDatos();
        } else {
            System.out.println("No hay mas formatos pendejo");
            return null;
        }
    }

    public static void mostrarDatos(Persistencia datos) {
        JFrame frame = new JFrame("Datos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Datos");

        JTable table = new JTable(model);

        for (String dato : ((basedeDatos) datos).cargarDatos()) {
            model.addRow(new Object[]{dato});
        }

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

abstract class Persistencia {
    public abstract void guardarDatos(String datos);

    public abstract String[] cargarDatos();
}

class Archivo extends Persistencia {
    String dato;

    public Archivo() {
        this.dato = "";
    }

    @Override
    public void guardarDatos(String datos) {
        this.dato = this.dato + "\n" + datos;
    }

    @Override
    public String[] cargarDatos() {
        JOptionPane.showMessageDialog(null, "Datos guardados: " + this.dato);
        return new String[0];
    }
}

class basedeDatos extends Persistencia {
    private Map<String, String> dato;

    public basedeDatos() {
        this.dato = new HashMap<>();
    }

    @Override
    public void guardarDatos(String datos2) {
        dato.put(Integer.toString(dato.size() + 1), datos2);
    }

    @Override
    public String[] cargarDatos() {
        return dato.values().toArray(new String[0]);
    }
}
