package test;

import main.CryptocurrencyVariation;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CryptocurrencyVariationTest {

    @Test
    public void testCalculateVariation() {
        CryptocurrencyVariation variation = new CryptocurrencyVariation();
        double percentageVariation = variation.calculateVariation(Arrays.asList(100.0, 120.0, 150.0));
        Assert.assertEquals(50, percentageVariation, 0.0001);
    }
}
