package CalculadoraDeSalario;

public class calculadoraDeSalario {
    String [] nombre;
    int [] horasTrabajadas;
    int tarifaPorHora;
    int [] salario;

    public calculadoraDeSalario() {
        nombre = new String[5];
        horasTrabajadas = new int[5];
        tarifaPorHora = 12;
        salario = new int[5];
    }

    public void setNombre(String nombre, int indice) {
        if (indice >= 0 && indice < this.nombre.length) {
            this.nombre[indice] = nombre;
        }
    }

    public void setHorasTrabajadas(int horasTrabajadas, int indice) {
        if (indice >= 0 && indice < this.horasTrabajadas.length) {
            this.horasTrabajadas[indice] = horasTrabajadas;
        }
    }

    public void setSalario(int indice) {
        if (indice >= 0 && indice < this.salario.length) {
            this.salario[indice] = this.horasTrabajadas[indice]*this.tarifaPorHora;
        }
    }

    public String mostrarInformacionTrabajador(int indice) {
        if (indice >= 0 && indice < nombre.length) {
            String info = "Trabajador " + (indice + 1) + ":\n" +
                    "Nombre: " + nombre[indice] + "\n" +
                    "Horas trabajadas: " + horasTrabajadas[indice] + "\n" +
                    "Salario: " + salario[indice] + "\n";
            return info;
        } else {
            return "no entiendo, como has conseguido que falle";
        }
    }
}
