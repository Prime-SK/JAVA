package aug7;

public class goldAcc extends bankAcc{
    private double overdraftLimit;

    public goldAcc(String name, String accountNo, double overdraftLimit) {
        super(name,accountNo);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount){
        if (amount > (balance + overdraftLimit)) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public void getAccountInfo() {
        System.out.println("        Gold Account");
        System.out.println("        Name : " + getName());
        System.out.println("        Account No : " + getAccountNo());
        System.out.println("        Balance : " + balance);
        System.out.println("        Overdraft Limit : " + overdraftLimit);
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    
}
