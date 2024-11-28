package main;

public class CryptocurrencySale {
    private static final double COMPANY_FEE = 0.005; // 0.5%

    public double calculateProfit(double grossSaleAmount) {
        double companyProfit = grossSaleAmount * COMPANY_FEE;
        return grossSaleAmount - companyProfit;
    }
}
