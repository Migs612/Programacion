package sistemaDeCalificaciones;

import java.awt.*;

public class sistemaDeCalificaciones {
    String[] nombre;
    String[] calificacion;
    String nombreDeCurso;
    int numAlumnos;

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        this.nombre = new String[numAlumnos];
        this.calificacion = new String[numAlumnos];
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNombre(String nombre, int indice) {
        this.nombre[indice] = nombre;
    }

    public void setCalificacion(String calificacion, int indice) {
        if (calificacion.equalsIgnoreCase("A") || calificacion.equalsIgnoreCase("B") || calificacion.equalsIgnoreCase("C") || calificacion.equalsIgnoreCase("D") || calificacion.equalsIgnoreCase("F")) {
            this.calificacion[indice] = calificacion;
        } else {
            this.calificacion[indice] = "Nota no valida";
        }
    }

    public void setNombreDeCurso(String nombreDeCurso) {
        this.nombreDeCurso = nombreDeCurso;
    }

    public String mostrarInformacionEstudiante(int indice) {
        if (indice >= 0 && indice < nombre.length) {
            String info = "Estudiante " + ":\n" +
                    "Nombre: " + nombre[indice] + "\n" +
                    "Grado: " + calificacion[indice] + "\n";
            return info;
        } else {
            return "Índice fuera de rango.";
        }
    }
}
