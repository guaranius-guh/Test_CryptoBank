package test;

import main.Debit;
import org.junit.Assert;
import org.junit.Test;

public class DebitTest {
    @Test
    public void testDebit() {
        Debit account = new Debit(1000.0);
        double debitedAmount = account.debit(100.0, 0.02); // 2% fee
        Assert.assertEquals(102.0, debitedAmount, 0.0001);
        Assert.assertEquals(898.0, account.getBalance(), 0.0001);
    }

    @Test
    public void testInsufficientBalance() {
        Debit account = new Debit(50.0);
        Assert.assertThrows(IllegalArgumentException.class, () -> account.debit(100, 0.02));
    }
}
