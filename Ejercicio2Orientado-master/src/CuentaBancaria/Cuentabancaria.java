package CuentaBancaria;

public class Cuentabancaria {
    private String titular;
    private Double saldo;

    public Cuentabancaria() {
        titular = " ";
        saldo = 30.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = this.saldo+saldo;
    }

    public String getTitular() {
        return "Bienvenido "+titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
