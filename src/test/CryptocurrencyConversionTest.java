package test;

import main.CryptocurrencyConversion;
import org.junit.Assert;
import org.junit.Test;

public class CryptocurrencyConversionTest {

    @Test
    public void testConvertToFiatCurrency() {
        CryptocurrencyConversion converter = new CryptocurrencyConversion();
        double convertedAmount = converter.convertToFiatCurrency(10.0, 5.5);
        Assert.assertEquals(55.0, convertedAmount, 0.0001);
    }
}
