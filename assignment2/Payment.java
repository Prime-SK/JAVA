package assignment2;

public class Payment {
    private double amount;
    private int month;

    public Payment(double amount, int month) {
        this.amount = amount;
        this.month = month;
    }

    public double getAmount() {
        return amount;
    }

    public int getMonth() {
        return month;
    }
}
