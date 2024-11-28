package main;

import java.util.List;

public class CryptocurrencyVariation {
    public double calculateVariation(List<Double> prices) {
        double initialPrice = prices.get(0);
        double finalPrice = prices.get(prices.size() - 1);
        return ((finalPrice - initialPrice) / initialPrice) * 100;
    }
}
