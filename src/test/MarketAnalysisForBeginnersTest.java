package test;

import main.MarketAnalysisForBeginners;
import org.junit.Assert;
import org.junit.Test;

public class MarketAnalysisForBeginnersTest {

    @Test
    public void testRecommendCrypto() {
        MarketAnalysisForBeginners analysis = new MarketAnalysisForBeginners();
        String recommendation = analysis.recommendCrypto(40, "Moderate");
        Assert.assertEquals("Recommended: Moderate-risk crypto.", recommendation);
    }
}
