package Ejercicio1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Main extends JFrame {
    private Map<String, String[]> datos;
    private JButton obtenerStock;
    private JButton actualizarStock;
    private JButton verStock;
    private JButton salir;

    public Main() {
        datos = new HashMap<>();
        setTitle("Gestion de inventarios");
        setSize(300, 110);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        obtenerStock = new JButton("Obtener Stock");
        actualizarStock = new JButton("Actualizar Stock");
        verStock = new JButton("Ver el stock");
        salir = new JButton("Salir");

        obtenerStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad:");
                String objeto = JOptionPane.showInputDialog("Ingrese el objeto:");
                guardarDatos(cantidad, objeto);
            }
        });

        actualizarStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarelStock();
            }
        });

        verStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Que te vaya bien"+"\n"+"Hasta luego");
                System.exit(0);
            }
        });

        add(obtenerStock);
        add(actualizarStock);
        add(verStock);
        add(salir);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void guardarDatos(String cantidad, String objeto) {
        datos.put(objeto, new String[]{cantidad, objeto});
    }

    public String[][] cargarDatos() {
        String[][] arrayDatos = new String[datos.size()][2];
        int i = 0;
        for (String[] dato : datos.values()) {
            arrayDatos[i] = dato;
            i++;
        }
        return arrayDatos;
    }

    public void actualizarelStock() {
        String clave = JOptionPane.showInputDialog("Cuál quieres modificar?");

        if (datos.containsKey(clave)) {
            String nuevaCantidad = JOptionPane.showInputDialog("Ingrese la nueva cantidad:");

            String[] arregloActual = datos.get(clave);

            arregloActual[0] = nuevaCantidad;

            datos.put(clave, arregloActual);

            mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "El producto no existe.");
        }
    }

    public void mostrarDatos() {
        JFrame frame = new JFrame("Datos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cantidad");
        model.addColumn("Objeto");

        JTable table = new JTable(model);

        for (String[] dato : cargarDatos()) {
            model.addRow(dato);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}



