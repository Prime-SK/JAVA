
public class Payment {
    private String paymentID;
    private String month;
    private double amount;
    private String courseCode;

    public Payment(String paymentID, String month, double amount, String courseCode) {
        this.paymentID = paymentID;
        this.month = month;
        this.amount = amount;
        this.courseCode = courseCode;
    }
    public String getPaymentID() {
        return paymentID;
    }
    public String getMonth() {
        return month;
    }
    public double getAmount() {
        return amount;
    }    

}
