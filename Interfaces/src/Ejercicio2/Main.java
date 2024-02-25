package Ejercicio2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JButton abrirPaypal;
    private JButton abrirCuenta;
    private JButton Salir;

    public Main() {
        setTitle("Mis Cuentas");
        setSize(300, 110);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        abrirPaypal = new JButton("Abrir Paypal");
        abrirCuenta = new JButton("Abrir Cuenta Bancaria");
        Salir = new JButton("Salir");

        abrirPaypal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Paypal paypal = new Paypal();
                paypal.setVisible(true);
            }
        });

        abrirCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                cuentaBancaria banco = new cuentaBancaria();
                banco.setVisible(true);
            }
        });

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSalir();
            }
        });

        add(abrirPaypal);
        add(abrirCuenta);
        add(Salir);
    }

    public void setSalir() {
        JOptionPane.showMessageDialog(null, "Que tengas buena tarde");
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}

class Paypal extends JFrame {
    private JButton enviarDinero;
    private JButton pedirDinero;
    private JButton cambiarCuenta;
    private JButton Salir;

    public Paypal() {
        setTitle("Cuenta de Paypal");
        setSize(300, 110);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        enviarDinero = new JButton("Enviar Dinero");
        pedirDinero = new JButton("Pedir Dinero");
        cambiarCuenta = new JButton("Cambiar a Cuenta Bancaria");
        Salir = new JButton("Salir");

        enviarDinero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnviarDinero();
            }
        });

        pedirDinero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPedirDinero();
            }
        });

        cambiarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                cuentaBancaria banco = new cuentaBancaria();
                banco.setVisible(true);
            }
        });

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSalir();
            }
        });

        add(enviarDinero);
        add(pedirDinero);
        add(cambiarCuenta);
        add(Salir);
    }

    public void setEnviarDinero() {
        String persona = JOptionPane.showInputDialog("Destinatario");
        int dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        JOptionPane.showMessageDialog(null, "Dinero enviado correctamente a " + persona + "\nCantidad enviada " + dinero +"$");
    }

    public void setPedirDinero() {
        String persona = JOptionPane.showInputDialog("A quien quieres pedirle dinero?");
        int dinero = Integer.parseInt(JOptionPane.showInputDialog("Cuanto pides?"));
        JOptionPane.showMessageDialog(null, "Has pedido dinero a " + persona + "\nCantidad enviada " + dinero +"$");
    }

    public void setSalir() {
        JOptionPane.showMessageDialog(null, "Que tengas buena tarde");
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}

class cuentaBancaria extends JFrame {
    private JButton hacerTransferencia;
    private JButton retirarDinero;
    private JButton ingresarDinero;
    private JButton verSaldo;
    private JButton cambiarCuenta;
    private JButton Salir;
    private int dinero;

    public cuentaBancaria() {
        setTitle("Cuenta de Paypal");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        hacerTransferencia = new JButton("Hacer Transferencia");
        verSaldo = new JButton("Ver Saldo");
        ingresarDinero = new JButton("Ingresar Dinero");
        retirarDinero = new JButton("Retirar Dinero");
        cambiarCuenta = new JButton("Cambiar a Paypal");
        Salir = new JButton("Salir");
        dinero = 40;

        hacerTransferencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setHacerTransferencia();
            }
        });

        ingresarDinero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setIngresarDinero();
            }
        });

        retirarDinero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setRetirarDinero();
            }
        });

        verSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVerSaldo();
            }
        });

        cambiarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Paypal paypal = new Paypal();
                paypal.setVisible(true);
            }
        });

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSalir();
            }
        });

        add(hacerTransferencia);
        add(ingresarDinero);
        add(retirarDinero);
        add(verSaldo);
        add(cambiarCuenta);
        add(Salir);
    }

    public void setHacerTransferencia() {
        String persona = JOptionPane.showInputDialog("Destinatario");
        int quitoDinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        if (this.dinero < quitoDinero) {
            JOptionPane.showMessageDialog(null, "Dinero enviado correctamente a " + persona + "\nCantidad enviada " + quitoDinero +"$");
            this.dinero -= quitoDinero;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }

    }

    public void setIngresarDinero(){
        int ingreso = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero quieres ingresar"));
        JOptionPane.showMessageDialog(null, "Dinero ingresado existosamente "+ingreso+"$");
        this.dinero += ingreso;
    }

    public void setRetirarDinero() {
        int retirada = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero quieres retirar"));
        JOptionPane.showMessageDialog(null, "Dinero retirado existosamente "+retirada+"$");
        this.dinero -= retirada;
    }

    public void setVerSaldo() {
        JOptionPane.showMessageDialog(null, "Tu saldo es de "+this.dinero+"$");
    }

    public void setSalir() {
        JOptionPane.showMessageDialog(null, "Que tengas buena tarde");
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}