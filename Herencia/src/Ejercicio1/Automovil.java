package Ejercicio1;

public class Automovil extends Vehiculo {
    private String tipoDeCombustible;

    public Automovil(String marca, String modelo, int ano, String tipoDeCombustible) {
        super(marca, modelo, ano);
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

}
