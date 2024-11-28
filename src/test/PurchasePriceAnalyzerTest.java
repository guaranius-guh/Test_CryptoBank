package test;

import main.PurchasePriceAnalyzer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PurchasePriceAnalyzerTest {

    @Test
    public void testAnalyzeBestPrice() {
        PurchasePriceAnalyzer analyzer = new PurchasePriceAnalyzer();
        double bestPrice = analyzer.analyzeBestPrice(Arrays.asList(500.0, 1000.0, 300.0, 400.0, 600.0));
        Assert.assertEquals(300.0, bestPrice, 0.0001);
    }
}
