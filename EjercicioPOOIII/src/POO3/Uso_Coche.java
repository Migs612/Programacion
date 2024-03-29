package POO3;

import javax.swing.*;

public class Uso_Coche {

    public static void main(String[] args) {


        Coche Subaru = new Coche();
        Subaru.establece_color("Amarillo");
        /*3. Aquí, mete en establece_color un valor para darle color al coche
         * Este parámetro se almacena en color_coche.
         * Los valores se pueden pasar por parámetro y por referencia.
         * Lo veremos más adelante.*/

        //Subaru.color="Morado Podemita";

        /*5. Con este paso se crea un problema de encapsulamiento.
         * Si recuerdas, anteriormente dije que poniendo las cosas
         * en private, podías evitar cambios. Color no tiene el modificador
         * de acceso private y, por tanto, puede editarse.
         * Cambia el color del coche al ejemplo.
         * Nunca debes poder manipular la instancia del objeto.
         * Cambia las características particulares a private
         * Ve a Coche.java*/


        /*7. Como ves, se genera un error con Subaru.color
         * Ya no es pública.
         * Vete a Coche.java*/

        /*9. Comenta o borra la línea de Subaru.color="Morado Podemita";
         * Vete a Coche.Java*/

        System.out.println(Subaru.dime_datos_generales());

        Subaru.establece_color(JOptionPane.showInputDialog("Introduce el color"));
        System.out.println(Subaru.dime_color());

        Subaru.configura_asientos(JOptionPane.showInputDialog("Tienes asientos de cuero"));
        System.out.println(Subaru.dime_asientos());

        Subaru.configura_Climatizador(JOptionPane.showInputDialog("Tienes climatizador o sos un motochorro?"));
        System.out.println(Subaru.dime_climatizador());
    }

}
