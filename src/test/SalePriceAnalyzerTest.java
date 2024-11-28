package test;

import main.SalePriceAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class SalePriceAnalyzerTest {

    @Test
    public void testCheckIdealSale() {
        SalePriceAnalyzer analyzer = new SalePriceAnalyzer();
        boolean idealSale = analyzer.checkIdealSale(100, 150, 50);
        Assert.assertTrue(idealSale);
    }
}
