package test;

import main.Debitar;
import org.junit.Assert;
import org.junit.Test;

public class DebitarTest {

    Debitar debitar = new Debitar(100.0);

    @Test
    public void testSaldoSuficiente() {
        double valorADebitar = 50.0;
        double saldoRestante = debitar.debitar(valorADebitar);

        System.out.println(saldoRestante);
        Assert.assertEquals(50.0, saldoRestante, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaldoInsuficiente() {
        double valorADebitar = 150.0;

        debitar.debitar(valorADebitar);
    }

    @Test
    public void testSaldoInsuficienteAssert() {
        double valorADebitar = 150.0;

        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            debitar.debitar(valorADebitar);
        });
        exception.getMessage();

    }
}
