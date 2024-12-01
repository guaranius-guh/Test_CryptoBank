package main;

import java.util.List;

public class AnalisaPrecoDeCompra {
    public boolean analisarMelhorPreco(List<Double> historicoPrecos, double precoAtual) {
        if (historicoPrecos == null || historicoPrecos.isEmpty()) {
            throw new IllegalArgumentException("O histórico de preços não pode ser vazio ou nulo.");
        }

        double menorPreco = Double.MAX_VALUE;
        for (double preco : historicoPrecos) {
            if (preco < menorPreco) {
                menorPreco = preco;
            }
        }

        double limiteAceitavel = menorPreco * 1.05;

        if (precoAtual <= limiteAceitavel) {
            System.out.println("Limite: " + limiteAceitavel);
            System.out.println("O preço de " + precoAtual + " é recomendável para comprar.");
            return true;
        } else {
            System.out.println("Limite: " + limiteAceitavel);
            System.out.println("O preço de " + precoAtual + " não é recomendável para comprar.");

            return false;
        }
    }
}
