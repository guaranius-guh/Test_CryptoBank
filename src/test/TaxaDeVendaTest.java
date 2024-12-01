package test;

import main.TaxaDeVenda;
import org.junit.Assert;
import org.junit.Test;

public class TaxaDeVendaTest {

    @Test
    public void testCalcularLucroNaVenda() {
        TaxaDeVenda taxaDeVenda = new TaxaDeVenda();

        double valorBrutoVenda = 1000.0;
        double lucroSemTaxa = taxaDeVenda.calcularLucroComTaxa(valorBrutoVenda);

        System.out.println("Lucro do Cliente: " + lucroSemTaxa);
        Assert.assertEquals(995.0, lucroSemTaxa, 0.001);
    }

    @Test
    public void testCalcularLucroEmpresa() {
        TaxaDeVenda taxaDeVenda = new TaxaDeVenda();

        double valorBrutoVenda = 1000.0;
        double lucroEmpresa = taxaDeVenda.calcularLucroEmpresa(valorBrutoVenda);

        System.out.println("Lucro da Empresa: " + lucroEmpresa);
        Assert.assertEquals(5.0, lucroEmpresa, 0.001);
    }
}