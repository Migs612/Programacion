package Pruebas1;

public class Main {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Loli");
        Empleados trabajador2 = new Empleados("Indalecio");

        trabajador1.cambiarSeccion("Recursos Humanos");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());

    }
}

class Empleados {
    private final String nombre;
    private String seccion;

    Empleados(String nom) {
        this.nombre = nom;
        seccion = "Administracion";
    }

    public void cambiarSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String devuelveDatos() {
        return "El nombre es " + this.nombre + " y la seccion es " + this.seccion;
    }
}
