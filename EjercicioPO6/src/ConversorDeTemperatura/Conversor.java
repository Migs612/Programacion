package ConversorDeTemperatura;

public class Conversor {
    private int temperatura;
    private final double factorConversion;
    private final int ajuste;

    public Conversor() {
        this.factorConversion = 1.8;
        this.ajuste = 32;
    }

    public void obtenerCelsius(int grado) {
        this.temperatura = grado;
    }

    public int darCelsius() {
        return this.temperatura;
    }

    public double convertirCelsius() {
        return (this.temperatura * this.factorConversion) + ajuste;
    }
}
