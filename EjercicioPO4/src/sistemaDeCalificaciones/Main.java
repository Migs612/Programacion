package sistemaDeCalificaciones;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        sistemaDeCalificaciones notas = new sistemaDeCalificaciones();

        notas.setNombreDeCurso(JOptionPane.showInputDialog("Que curso es?"));
        notas.setNumAlumnos(Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos sois?")));

        int numAlumnos = notas.getNumAlumnos();

        for (int i = 0; i < numAlumnos; i++) {
            notas.setNombre(JOptionPane.showInputDialog("Como te llamas?"),i);
            notas.setCalificacion(JOptionPane.showInputDialog("Cual es tu calificacion?"),i);
        }

        for (int i = 0; i < numAlumnos; i++) {
            JOptionPane.showMessageDialog(null, notas.mostrarInformacionEstudiante(i));
        }
    }
}
