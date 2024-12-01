package main;

public class ConverterMoeda {
    public double converterCriptoParaDinheiro(double quantidadeCripto, double taxaDeCambio) {
        System.out.println(quantidadeCripto * taxaDeCambio);
        return quantidadeCripto * taxaDeCambio;
    }

    public double converterDinheiroParaCripto(double quantidadeDinheiro, double taxaDeCambio) {
        System.out.println(quantidadeDinheiro * taxaDeCambio);
        return quantidadeDinheiro * taxaDeCambio;
    }
}
