package Estudiante;

public class Estudiante {
    private String nombre;
    private int edad;
    private double calificacion;

    public Estudiante() {
        nombre = " ";
        edad = 15;
        calificacion = 0.0;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
