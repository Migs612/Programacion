package ContadorDeInstancias;

public class contadorInstancias {
    private static int numInstancias = 0;

    public contadorInstancias() {
        numInstancias++;
    }

    public static int getNumInstancias() {
        return numInstancias;
    }
}
