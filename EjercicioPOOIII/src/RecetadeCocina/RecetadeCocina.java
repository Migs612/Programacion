package RecetadeCocina;

public class RecetadeCocina {
    private String[] condimentos;
    private String[] pasosCocina;
    private String[] recetas;

    public RecetadeCocina() {
        recetas = new String[3];
    }

    public String[] getPasosCocina() {
        return pasosCocina;
    }

    public void setPasosCocina(String[] pasosCocina) {
        this.pasosCocina = pasosCocina;
    }

    public void getCondimentosPasta() {
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.println("y "+condimentos[i]);
            } else {
                System.out.print(condimentos[i]+"\t");
            }
        }
    }

    public void getCondimentosCuscus() {
        for (int i = 0; i < 12; i++){
            if (i == 11) {
                System.out.println("y "+condimentos[i]);
            } else {
                System.out.print(condimentos[i]+"\t");
            }
        }
    }
    public void getCondimentosArroz() {
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.println("y "+condimentos[i]);
            } else {
                System.out.print(condimentos[i]+"\t");
            }
        }
    }

    public void setCondimentosPasta() {
        this.condimentos = new String[6];

        condimentos[0] = "3 Yemas de huevo";
        condimentos[1] = "1 Huevo";
        condimentos[2] = "100g Pancete";
        condimentos[3] = "50g Queso";
        condimentos[4] = "Pimienta , Sal";
        condimentos[5] = "Espaguetis";
    }
    public void setCondimentosCuscus(){
        this.condimentos = new String[12];

        condimentos[0] = "250 gramos de cuscus precocido";
        condimentos[1] = "1 pimiento verde";
        condimentos[2] = "1 pepino";
        condimentos[3] = "1 cebolla morada";
        condimentos[4] = "3 cucharadas de pasas de Corinto";
        condimentos[5] = "2 cucharadas de aceitunas negras";
        condimentos[6] = "Medio diente de ajo";
        condimentos[7] = "1 limon";
        condimentos[8] = "2 ramitas de menta";
        condimentos[9] = "3 ramitas de perejil";
        condimentos[10] = "3 cucharadas de aceite de oliva";
        condimentos[11] = "Sal y pimienta";
    }
    public void setCondimentosArroz(){
        this.condimentos = new String[6];

        condimentos[0] = "800 g de arroz blanco";
        condimentos[1] = "2 pechugas de pollo";
        condimentos[2] = "150 gramos de champiñones";
        condimentos[3] = "Curry en polvo";
        condimentos[4] = "Aceite,Sal y Pimienta";
        condimentos[5] = "Agua (según las indicaciones del arroz)";
    }

    public void masIngredientes(String ingredientes, String receta) {
        if (receta.equalsIgnoreCase("1")) {
            this.condimentos = new String[7];

            condimentos[6] = ingredientes;
        }
    }

    public String[] getRecetas() {
        return recetas;
    }

    public void setRecetas(String[] recetas) {
        this.recetas = recetas;
    }
}
