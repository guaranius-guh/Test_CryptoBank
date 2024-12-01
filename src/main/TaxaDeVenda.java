package main;

public class TaxaDeVenda {
    private static final double TAXA_EMPRESA = 0.005;

    public double calcularLucroComTaxa(double valorBrutoVenda) {
        double lucroEmpresa = valorBrutoVenda * TAXA_EMPRESA;
        System.out.println("Parte da empresa: " + lucroEmpresa);
        return valorBrutoVenda - lucroEmpresa;
    }

    public double calcularLucroEmpresa(double valorBrutoVenda) {
        return valorBrutoVenda * TAXA_EMPRESA;
    }
}
