package main;

public class SaleProfitCalculation {
    public double calculateProfit(double purchasePrice, double salePrice) {
        return salePrice - purchasePrice;
    }

    public double calculateProfitPercentage(double purchasePrice, double salePrice) {
        return ((salePrice - purchasePrice) / purchasePrice) * 100;
    }
}
