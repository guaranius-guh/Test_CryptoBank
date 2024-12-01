package main;

public class Variacao {
    public double calcularVariacao(double precoInicial, double precoFinal) {
        return ((precoFinal - precoInicial) / precoInicial) * 100;
    }
}
