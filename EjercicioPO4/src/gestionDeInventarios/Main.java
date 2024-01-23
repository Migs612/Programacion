package gestionDeInventarios;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        gestionDeInventarios almacen = new gestionDeInventarios();

        almacen.setObjetos(Integer.parseInt(JOptionPane.showInputDialog("Cuantos objetos hay?")));

        for (int i = 0; i < almacen.getObjetos(); i++) {
            almacen.setNomObjeto(JOptionPane.showInputDialog("Que objeto es?"),i);
            almacen.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Cuanto cuesta?")),i);
            almacen.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Cuantos hay?")),i);
        }

        for (int i = 0;i< almacen.getObjetos(); i++) {
            JOptionPane.showMessageDialog(null,almacen.mostrarInformacionAlmacen(i));
        }



    }
}
