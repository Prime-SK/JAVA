
import java.util.*;

public class Student {
    private String name;
    private String regNo;
    private String password;

    ArrayList<Payment> payments = new ArrayList<>(); 
       

    public Student(String name, String regNo, String password) {
        this.name = name;
        this.regNo = regNo;
        this.password = password;
    }

    public  String getName() {
        return name;
    }   
    public String getRegNo() {
        return regNo;
    }
    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }    
    public void studentinfo(){
        System.out.println("Name : " + name);
        System.out.println("Reg No : " + regNo);
        System.out.println("Password : " + password);
    }   
    public void addPayment(String paymentID, String month, double amount, String courseCode){
        Payment p = new Payment(paymentID, month, amount, courseCode);
        payments.add(p);
    }   

    
}


