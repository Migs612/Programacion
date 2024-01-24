package poo5Parametros;

import javax.swing.*;
import java.util.*;

public class Uso_Empleados {
    public static void main(String[] args) {
        Empleado clase = new Empleado(JOptionPane.showInputDialog("Como te llamas?"),
                Double.parseDouble(JOptionPane.showInputDialog("Cuanto cobras?")),
                Integer.parseInt(JOptionPane.showInputDialog("En que año empezaste?")),
                Integer.parseInt(JOptionPane.showInputDialog("En que mes empzaste?")),
                Integer.parseInt(JOptionPane.showInputDialog("Que dia empezaste?")));

        clase.subeSueldo(15);

        JOptionPane.showMessageDialog(null,clase.verEmpleado());
    }
}

class Empleado {

    public Empleado(String nom,Double sueldo,int ano,int mes , int dia) {

        nombre = nom;
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(ano, mes-1 ,dia);

        alta_contrato=calendario.getTime();
    }

    public String dameNombre(String nombre) {
        return nombre;
    }

    public Double verSueldo(double sueldo) {
        return sueldo;
    }

    public Date dameFechaContrato() {
        return alta_contrato;
    }

    public String verEmpleado() {
        String info =
                "Trabajador: " + nombre + "\n" +
                "Sueldo: " + sueldo + "\n" +
                "Incorporacion: " + alta_contrato + "\n";
        return info;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }
    private String nombre;
    private Double sueldo;
    private Date alta_contrato;
}
