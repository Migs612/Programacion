package ValidadorDeDatos;

public class validadorDatos {
    public static boolean esNumeroEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean estaEnRango(int numero, int minimo, int maximo) {
        return numero >= minimo && numero <= maximo;
    }
}
