package Ejercicio3;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JButton obtenerStock;
    private JButton actualizarStock;

    public Main() {
        setTitle("Gestion de inventarios");
        setSize(300, 80);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        obtenerStock = new JButton("Obtener Stock");
        actualizarStock = new JButton("Actualizar Stock");

        add(obtenerStock);
        add(actualizarStock);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2.Main().setVisible(true);
            }
        });
    }
}

