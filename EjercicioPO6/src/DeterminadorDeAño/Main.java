package DeterminadorDeAño;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Determinador Bisiesto = new Determinador();

        Bisiesto.getAno(Integer.parseInt(JOptionPane.showInputDialog("Que año quieres comprobar")));

        if (Bisiesto.comprobarAno()) {
            JOptionPane.showMessageDialog(null,"El año es bisiesto");
        } else {
            JOptionPane.showMessageDialog(null,"El año no es bisiesto");
        }
    }

}

class Determinador {
    private final int comprobador1;
    private final int comprobador2;
    private final int comprobador3;
    private int ano;
    private boolean comprobado;

    public Determinador() {
        comprobador1 = 4;
        comprobador2 = 100;
        comprobador3 =400;
    }

    public void getAno(int ano) {
        this.ano = ano;
    }

    public boolean comprobarAno() {
        return this.comprobado = (ano % comprobador1 == 0 && ano % comprobador2 != 0) || (ano % comprobador2 != 0 && ano % comprobador3 == 0);
    }
}
