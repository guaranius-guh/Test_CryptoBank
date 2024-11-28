package main;

public class SalePriceAnalyzer {
    public boolean checkIdealSale(double purchasePrice, double salePrice, double priceThreshold) {
        double priceIncreasePercent = (salePrice - purchasePrice) / purchasePrice * 100;
        return priceIncreasePercent >= priceThreshold;
    }
}
