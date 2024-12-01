package test;

import main.ConverterMoeda;
import org.junit.Assert;
import org.junit.Test;

public class ConverterMoedaTest {

    ConverterMoeda conversor = new ConverterMoeda();

    @Test
    public void testConverterCriptoParaDinheiro() {
        double quantidadeCripto = 5.0;
        double taxaDeCambio = 100.0;
        double resultado = conversor.converterCriptoParaDinheiro(quantidadeCripto, taxaDeCambio);

        Assert.assertEquals(500.0, resultado, 0.001);
    }

    @Test
    public void testConverterDinheiroParaCripto() {
        double quantidadeDinheiro = 500.0;
        double taxaDeCambio = 0.01;
        double resultado = conversor.converterDinheiroParaCripto(quantidadeDinheiro, taxaDeCambio);

        Assert.assertEquals(5.0, resultado, 0.001);
    }
}
