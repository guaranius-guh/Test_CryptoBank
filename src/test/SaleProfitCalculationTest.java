package test;

import main.SaleProfitCalculation;
import org.junit.Assert;
import org.junit.Test;

public class SaleProfitCalculationTest {

    @Test
    public void testCalculateProfit() {
        SaleProfitCalculation calculation = new SaleProfitCalculation();
        double profit = calculation.calculateProfit(100, 150);
        Assert.assertEquals(50, profit, 0.0001);
    }

    @Test
    public void testCalculateProfitPercentage() {
        SaleProfitCalculation calculation = new SaleProfitCalculation();
        double profitPercentage = calculation.calculateProfitPercentage(100, 150);
        Assert.assertEquals(50, profitPercentage, 0.0001);
    }
}
