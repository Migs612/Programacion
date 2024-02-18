package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPrueba extends JFrame {
    private JButton btnAcelerar;
    private JButton btnFrenar;
    private int velocidad = 0;
    private Timer timer;

    public MainPrueba() {
        setTitle("Control de Velocidad");
        setSize(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        btnAcelerar = new JButton("Acelerar");
        btnFrenar = new JButton("Frenar");

        btnAcelerar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        velocidad += 1;
                        System.out.println("Velocidad: " + velocidad + " km/h");
                    }
                });
                timer.start();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (timer != null) {
                    timer.stop();
                }
            }
        });

        btnFrenar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        if (velocidad > 0) {
                            velocidad -= 1;
                            System.out.println("Velocidad: " + velocidad + " km/h");
                        } else {
                            timer.stop();
                        }
                    }
                });
                timer.start();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (timer != null) {
                    timer.stop();
                }
            }
        });

        add(btnAcelerar);
        add(btnFrenar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainPrueba().setVisible(true);
            }
        });
    }
}
