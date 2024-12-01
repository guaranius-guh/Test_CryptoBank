package main;

public class Debitar {
    private double saldo;

    public Debitar(Double saldo) {
        this.saldo = saldo;
    }

    public double debitar(double valorADebitar) {
        if (saldo >= valorADebitar) {
            saldo -= valorADebitar;
            return saldo;
        } else {
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
    }
}
