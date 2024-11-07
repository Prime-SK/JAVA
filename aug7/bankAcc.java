package aug7;

// import java.util.Random;

public class bankAcc {
    private String accountNo;
    private String name;
    protected double balance;

    public bankAcc(String name, String accountNo) {
        // Random rand = new Random();
        this.name = name;
        this.accountNo = accountNo;
        // this.accountNo = String.valueOf(rand.nextInt(1000000,9999999));
        this.balance = 0;
    }

    public String getAccountNo() {
        return accountNo;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getAccountInfo() {
        System.out.println("        Name : " + name);
        System.out.println("        Account No : " + accountNo);
        System.out.println("        Balance : " + balance);
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public boolean withdraw(double amount){
        if (amount > balance) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
}

/*      
   +-------------------------------+
   |          bankAccount          |
   +-------------------------------+
   | - accountNo : String          |     
   | - name : String               |          
   | - balance : double            |          
   +-------------------------------+
   | + getAccountNo() : String     |                          
   | + getName() : String          |                      
   | + getBlanace : double         |                      
   | + getAccountInfo()            |                      
   | + setName(String)             |                  
   | + deposit(double)             |                  
   | + withdraw(double) : boolean  |                              
   +-------------------------------+
 */