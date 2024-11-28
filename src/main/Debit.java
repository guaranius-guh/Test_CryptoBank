package main;

public class Debit {
    private double balance;

    public Debit(Double balance) {
        this.balance = balance;
    }

    public double debit(double amount, double fee) {
        double amountWithFee = amount + (amount * fee);
        if (balance >= amountWithFee) {
            balance -= amountWithFee;
            return amountWithFee;
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
