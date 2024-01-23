package gestionDeInventarios;

public class gestionDeInventarios {
    int objetos;
    int [] cantidad;
    float [] precio;
    String [] nomObjeto;

    public void setObjetos(int objetos) {
        this.objetos = objetos;
        this.cantidad = new int[objetos];
        precio = new float[objetos];
        nomObjeto = new String[objetos];
    }

    public int getObjetos() {
        return objetos;
    }

    public void setNomObjeto(String nomObjeto,int i) {
        this.nomObjeto[i] = nomObjeto;
    }

    public void setCantidad(int cantidad, int i) {
        this.cantidad[i] = cantidad;
    }

    public void setPrecio(float precio, int i) {
        this.precio [i] = precio;
    }

    public String mostrarInformacionAlmacen(int indice) {
        if (indice >= 0 && indice < nomObjeto.length) {
            String info =
                    "Objeto " + ":\n" +
                    "Nombre: " + nomObjeto[indice] + "\n" +
                    "Precio: " + precio[indice] + "$\n" +
                    "Cantidad: " + cantidad[indice];
            return info;
        } else {
            return "Índice fuera de rango.";
        }
    }
}
