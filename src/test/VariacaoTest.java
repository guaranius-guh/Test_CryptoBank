package test;

import main.Variacao;
import org.junit.Assert;
import org.junit.Test;

public class VariacaoTest {

    Variacao variacao = new Variacao();

    @Test
    public void testCalcularVariacao() {
        double precoInicial = 100.0;
        double precoFinal = 150.0;
        double variacaoPercentual = variacao.calcularVariacao(precoInicial, precoFinal);

        System.out.println(variacaoPercentual + "%");
        Assert.assertEquals(50.0, variacaoPercentual, 0.001);
    }

    @Test
    public void testCalcularVariacaoNegativa() {
        double precoInicial = 100.0;
        double precoFinal = 50.0;
        double variacaoPercentual = variacao.calcularVariacao(precoInicial, precoFinal);

        System.out.println(variacaoPercentual + "%");
        Assert.assertEquals(-50.0, variacaoPercentual, 0.001);
    }
}
