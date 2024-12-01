package test;

import main.LucroNaVenda;
import org.junit.Assert;
import org.junit.Test;

public class LucroNaVendaTest {

    LucroNaVenda lucroNaVenda = new LucroNaVenda();

    @Test
    public void testCalcularLucro() {
        double precoCompra = 1000.0;
        double precoVenda = 1500.0;
        double lucro = lucroNaVenda.calcularLucro(precoCompra, precoVenda);

        System.out.println(lucro);
        Assert.assertEquals(492.5, lucro, 0.001);
    }

    @Test
    public void testCalcularPorcentagemLucro() {
        double precoCompra = 1000.0;
        double precoVenda = 2000.0;
        double porcentagemLucro = lucroNaVenda.calcularPorcentagemLucro(precoCompra, precoVenda);

        System.out.println(porcentagemLucro + "%");
        Assert.assertEquals(99.0, porcentagemLucro, 0.001);
    }
}
