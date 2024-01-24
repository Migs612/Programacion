package CreacionClaseEmpleado;

import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;

public class Uso_Empleado {
    public static void main(String[] args) {
        misEmpleados Empleado1 = crearEmpleado();

        misEmpleados Empleado2 = crearEmpleado();

        misEmpleados Empleado3 = crearEmpleado();

        List<misEmpleados> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(Empleado1);
        listaEmpleados.add(Empleado2);
        listaEmpleados.add(Empleado3);

        Collections.sort(listaEmpleados);

        for (misEmpleados empleado : listaEmpleados) {
            empleado.subeSueldo(5);
        }


        for (misEmpleados empleado : listaEmpleados) {
            empleado.dimeDatos();
        }

    }

    private static misEmpleados crearEmpleado() {
        String nombre = JOptionPane.showInputDialog("Como te llamas?");
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Cuanto cobras?"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("En que año empezaste?"));
        int month = Integer.parseInt(JOptionPane.showInputDialog("En que mes empzaste?"));
        int day = Integer.parseInt(JOptionPane.showInputDialog("Que dia empezaste?"));

        return new misEmpleados(nombre, sueldo, year, month, day);
    }
}

class misEmpleados implements Comparable<misEmpleados> {

    public int compareTo(misEmpleados otroEmpleado) {
        return this.alta.compareTo(otroEmpleado.alta);
    }

    private String nombre;
    private double sueldo;
    private Date alta;

    public misEmpleados(String nombre, double sueldo, int agno, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

        this.alta = calendario.getTime();
    }

    public void subeSueldo(double porcentaje) {
        Calendar limite2021 = new GregorianCalendar(2021, Calendar.DECEMBER, 31);
        if (alta.before(limite2021.getTime())) {
            double aumento = sueldo * porcentaje / 100;
            sueldo += aumento;
        }
    }

    public void dimeDatos() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechaAlta = formatoFecha.format(alta);

        JOptionPane.showMessageDialog(null, "Nombre " + nombre + "\n" + "Sueldo " + sueldo + "\n" + "Alta " + fechaAlta);
    }

}
