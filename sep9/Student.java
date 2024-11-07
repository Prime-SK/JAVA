package sep9;

import java.util.ArrayList;

public class Student {
    private String name;
    private String ID;
    private ArrayList<Payment> payments = new ArrayList<Payment>();

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public void makePayment(String paymentID, String courseID, int month, double amount) {
        Payment payment = new Payment(paymentID, courseID, month, amount);
        payments.add(payment);
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
}
