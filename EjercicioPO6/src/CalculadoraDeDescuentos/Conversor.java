package CalculadoraDeDescuentos;

import javax.swing.*;

public class Conversor {
    private final double descuento;
    private int unidades;
    private double precio;
    private double precioFinal;

    public Conversor() {
        this.descuento = 0.10;
    }

    public void setUnidades() {
        this.unidades = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades tienes?"));
        this.precio = Double.parseDouble(JOptionPane.showInputDialog("Cuanto cuesta cada unidad"));
        this.precioFinal = this.unidades * this.precio;

        if (this.unidades >= 5) {
            ponerDescuento();
        }
    }

    public void ponerDescuento() {
        double precioDescuento = this.precioFinal * this.descuento;

        this.precioFinal = this.precioFinal+precioDescuento;
    }

    public void DatosFinal() {
        JOptionPane.showMessageDialog(null,"El precio final es de " + this.precioFinal);
    }
}
