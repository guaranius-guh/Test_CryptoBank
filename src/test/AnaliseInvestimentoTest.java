package test;

import main.AnaliseInvestimento;
import main.PerfilInvestidor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AnaliseInvestimentoTest {

    AnaliseInvestimento analise = new AnaliseInvestimento();

    @Test
    public void testConservadorDentroDoRisco() {
        PerfilInvestidor perfilConservador = PerfilInvestidor.CONSERVADOR;
        double variacao = 0.08;

        boolean resultado = analise.analisarInvestimento(perfilConservador, variacao);

        Assert.assertTrue(resultado);
    }

    @Test
    public void testConservadorForaDoRisco() {
        PerfilInvestidor perfilConservador = PerfilInvestidor.CONSERVADOR;
        double variacao = 0.15;

        boolean resultado = analise.analisarInvestimento(perfilConservador, variacao);

        Assert.assertFalse(resultado);
    }

    @Test
    public void testModeradoDentroDoRisco() {
        PerfilInvestidor perfilModerado = PerfilInvestidor.MODERADO;
        double variacao = 0.25;

        boolean resultado = analise.analisarInvestimento(perfilModerado, variacao);

        Assert.assertTrue(resultado);
    }

    @Test
    public void testModeradoForaDoRisco() {
        PerfilInvestidor perfilModerado = PerfilInvestidor.MODERADO;
        double variacao = 0.35;

        boolean resultado = analise.analisarInvestimento(perfilModerado, variacao);

        Assert.assertFalse(resultado);
    }

    @Test
    public void testOusadoDentroDoRisco() {
        PerfilInvestidor perfilOusado = PerfilInvestidor.OUSADO;
        double variacao = 0.4;

        boolean resultado = analise.analisarInvestimento(perfilOusado, variacao);

        Assert.assertTrue(resultado);
    }

    @Test
    public void testOusadoForaDoRisco() {
        PerfilInvestidor perfilOusado = PerfilInvestidor.OUSADO;
        double variacao = 0.6;

        boolean resultado = analise.analisarInvestimento(perfilOusado, variacao);

        Assert.assertFalse(resultado);
    }
}
