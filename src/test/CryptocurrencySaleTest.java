package test;

import main.CryptocurrencySale;
import org.junit.Assert;
import org.junit.Test;

public class CryptocurrencySaleTest {

    @Test
    public void testCalculateProfit() {
        CryptocurrencySale sale = new CryptocurrencySale();
        double profit = sale.calculateProfit(1000);
        Assert.assertEquals(995, profit, 0.0001);
    }
}
