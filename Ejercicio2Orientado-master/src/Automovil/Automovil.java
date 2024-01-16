package Automovil;

public class Automovil {
    private String marca;
    private String modelo;

    public Automovil() {
        marca = "Desconocida";
        modelo = "R8";
    }

    public String getMarca() {
        return "Tu marca de coche es " + marca;
    }

    public String getModelo() {
        return "El modelo es " + modelo;
    }

    public void setMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

    public String nuevoAutomovil() {
        return "Tu coche sera de la marca " + marca + " y el modelo sera un " + modelo;
    }
}
