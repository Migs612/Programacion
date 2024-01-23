package RegistrodeEstudiantes;

public class registroDeEstudiantes {
    String [] nombre;
    int [] edad;
    String [] grado;

    registroDeEstudiantes () {
        nombre = new String[3];
        edad = new int[3];
        grado = new String[3];
    }

    public void setNombre(String nombre, int indice) {
        if (indice >= 0 && indice < this.nombre.length) {
            this.nombre[indice] = nombre;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void setEdad(int edad, int indice) {
        if (indice >= 0 && indice < this.edad.length) {
            this.edad[indice] = edad;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void setGrado(String grado, int indice) {
        if (indice >= 0 && indice < this.grado.length) {
            this.grado[indice] = grado;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public String mostrarInformacionEstudiante(int indice) {
        if (indice >= 0 && indice < nombre.length) {
            String info = "Estudiante " + (indice + 1) + ":\n" +
                    "Nombre: " + nombre[indice] + "\n" +
                    "Edad: " + edad[indice] + "\n" +
                    "Grado: " + grado[indice] + "\n";
            return info;
        } else {
            return "Índice fuera de rango.";
        }
    }
}
