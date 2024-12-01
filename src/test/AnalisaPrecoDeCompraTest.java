package test;

import main.AnalisaPrecoDeCompra;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AnalisaPrecoDeCompraTest {

    AnalisaPrecoDeCompra analisaPreco = new AnalisaPrecoDeCompra();

    @Test
    public void testPrecoAtualDentroDaMargem() {
        List<Double> historicoPrecos = Arrays.asList(100.0, 95.0, 97.0, 110.0, 92.0);

        double precoAtual = 95.0;

        boolean resultado = analisaPreco.analisarMelhorPreco(historicoPrecos, precoAtual);

        Assert.assertTrue(resultado);
    }

    @Test
    public void testPrecoAtualForaDaMargem() {
        List<Double> historicoPrecos = Arrays.asList(100.0, 95.0, 97.0, 110.0, 92.0);

        double precoAtual = 98.0;

        boolean resultado = analisaPreco.analisarMelhorPreco(historicoPrecos, precoAtual);

        Assert.assertFalse(resultado);
    }

    @Test
    public void testPrecoAtualIgualAoLimite() {
        List<Double> historicoPrecos = Arrays.asList(100.0, 95.0, 97.0, 110.0, 92.0);

        double precoAtual = 96.60000000000001;

        boolean resultado = analisaPreco.analisarMelhorPreco(historicoPrecos, precoAtual);

        Assert.assertTrue(resultado);
    }
}
