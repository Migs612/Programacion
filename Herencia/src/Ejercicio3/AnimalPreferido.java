package Ejercicio3;

public class AnimalPreferido extends Animal {
    private String tipoAnimal;

    public AnimalPreferido() {
        super();
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
        if ("perros".equals(tipoAnimal)) {
            setRuido("El perro ladra");
        } else if ("gatos".equals(tipoAnimal)) {
            setRuido("El gato maulla");
        }
    }
}
