package sep9;

public class Payment {
    private String paymentID;
    private String courseID;
    private int month;
    private double amount;

    public Payment(String paymentID, String courseID, int month, double amount) {
        this.paymentID = paymentID;
        this.courseID = courseID;
        this.month = month;
        this.amount = amount;
    }

    public String getPaymentID() {
        return paymentID;
    }
    
    public String getCourseID() {
        return courseID;
    }

    public int getMonth() {
        return month;
    }

    public double getAmount() {
        return amount;
    }
}
