package CalculadoraDeImpuestos;

public class Calculadora {
    private final double impuesto;
    int dineroIngresado;

    Calculadora(double impuesto) {
        this.impuesto = impuesto / 100.0;
    }

    public void ingresarDinero(int dinero) {
        this.dineroIngresado = dinero;
    }

    public double dineroFinal() {
        return this.dineroIngresado * this.impuesto;
    }
}