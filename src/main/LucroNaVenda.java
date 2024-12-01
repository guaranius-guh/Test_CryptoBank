package main;

public class LucroNaVenda {
    TaxaDeVenda taxa = new TaxaDeVenda();

    public double calcularLucro(double precoCompra, double precoVenda) {
        return (precoVenda - taxa.calcularLucroEmpresa(precoVenda)) - precoCompra;
    }

    public double calcularPorcentagemLucro(double precoCompra, double precoVenda) {
        return (((precoVenda - taxa.calcularLucroEmpresa(precoVenda)) - precoCompra) / precoCompra) * 100;
    }
}
