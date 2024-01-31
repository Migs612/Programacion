package ContadorDeInstancias;

public class main {
    public static void main(String[] args) {
        contadorInstancias numero1 = new contadorInstancias();
        contadorInstancias numero2 = new contadorInstancias();

        System.out.println("Número de instancias creadas: " + contadorInstancias.getNumInstancias());
    }
}

