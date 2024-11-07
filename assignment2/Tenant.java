package assignment2;

import java.util.ArrayList;

public class Tenant {
    private String name;
    private String roomID;
    private ArrayList<Payment> payments = new ArrayList<Payment>();

    public Tenant(String name, String roomID) {
        this.name = name;
        this.roomID = roomID;
    }

    public boolean makePayment(double amount, int month) {
        for (Payment payment : payments) {
            if (payment.getMonth() == month) {
                System.out.println("Payment already made for this month");
                return false;
            }
        }
        Payment payment = new Payment(amount, month);
        payments.add(payment);
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRoomID() {
        return roomID;
    }

    public void displayPayments() {
        for (int i = 0; i < payments.size(); i++) {
            System.out.println(payments.get(i).getAmount() + " , " + payments.get(i).getMonth());
        }
    }

    public double getTotalPayments() {
        double total = 0;
        for (int i = 0; i < payments.size(); i++) {
            total += payments.get(i).getAmount();
        }
        return total;
    }

    public boolean hasPaidForMonth(int month) {
        for (int i = 0; i < payments.size(); i++) {
            if (payments.get(i).getMonth() == month) {
                return true;
            }
        }
        return false;
    }

    public void paymentHistory(){
        for (Payment payment : payments) {
            System.out.println("Month " + payment.getMonth() + " : " + payment.getAmount());
        }
    }
}
