package Ejercicio2;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante (String carrera) {
        super();
        this.carrera = carrera;
    }

    public String getCarrera() {
        return  this.carrera;
    }
}
