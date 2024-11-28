package main;

import java.util.List;

public class PurchasePriceAnalyzer {
    public double analyzeBestPrice(List<Double> priceHistory) {
        double lowestPrice = Double.MAX_VALUE;
        for (double price : priceHistory) {
            if (price < lowestPrice) {
                lowestPrice = price;
            }
        }
        return lowestPrice;
    }
}
