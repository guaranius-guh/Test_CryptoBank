package main;

public class AnalisaPrecoDeVenda {
    public boolean analisarMelhorPreco(double precoCompra, double precoVenda) {
        final double LIMITE_PERCENTUAL = 50;
        double aumentoPercentual = (precoVenda - precoCompra) / precoCompra * 100;
        if (aumentoPercentual >= LIMITE_PERCENTUAL) {
            System.out.println("Variação de preço de " + aumentoPercentual + "%");
            System.out.println("Preço está bom para vender esta Cripto");
            return true;
        } else {
            System.out.println("Variação de preço de " + aumentoPercentual + "%");
            System.out.println("O preço atual não é vantajoso para a venda da Cripto");
            return false;
        }
    }
}
