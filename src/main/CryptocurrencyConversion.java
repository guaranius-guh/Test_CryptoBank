package main;

public class CryptocurrencyConversion {
    public double convertToFiatCurrency(double cryptoAmount, double exchangeRate) {
        return cryptoAmount * exchangeRate;
    }

    public double convertToCash(double cryptoAmount, double exchangeRate) {
        return cryptoAmount * exchangeRate;
    }
}
