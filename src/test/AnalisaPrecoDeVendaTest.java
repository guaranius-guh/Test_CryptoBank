package test;

import main.AnalisaPrecoDeVenda;
import org.junit.Assert;
import org.junit.Test;

public class AnalisaPrecoDeVendaTest {

    AnalisaPrecoDeVenda analisaPrecoVenda = new AnalisaPrecoDeVenda();

    @Test
    public void testPrecoVendaMaiorQueCompra() {
        double precoCompra = 100.0;
        double precoVenda = 150.0;
        boolean resultado = analisaPrecoVenda.analisarMelhorPreco(precoCompra, precoVenda);

        Assert.assertTrue(resultado);
    }

    @Test
    public void testPrecoVendaMenorQue50Porc() {
        double precoCompra = 100.0;
        double precoVenda = 105.0;
        boolean resultado = analisaPrecoVenda.analisarMelhorPreco(precoCompra, precoVenda);

        Assert.assertFalse(resultado);
    }

    @Test
    public void testPrecoVendaMenorQueCompra() {
        double precoCompra = 100.0;
        double precoVenda = 25.0;
        boolean resultado = analisaPrecoVenda.analisarMelhorPreco(precoCompra, precoVenda);

        Assert.assertFalse(resultado);
    }
}
