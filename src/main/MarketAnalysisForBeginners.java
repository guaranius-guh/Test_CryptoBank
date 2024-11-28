package main;

public class MarketAnalysisForBeginners {
    public String recommendCrypto(double risk, String profile) {
        if (profile.equals("Conservative") && risk > 10) {
            return "Recommended: Low-risk crypto.";
        } else if (profile.equals("Moderate") && risk > 30) {
            return "Recommended: Moderate-risk crypto.";
        } else if (profile.equals("Aggressive") && risk > 50) {
            return "Recommended: High-risk crypto.";
        }
        return "No suitable recommendation.";
    }
}
