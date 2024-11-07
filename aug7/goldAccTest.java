package aug7;

public class goldAccTest {
    public static void main(String[] args) {
        goldAcc acc = new goldAcc("abc", "123456", 5000);
        acc.deposit(500);
        acc.getAccountInfo();
        acc.withdraw(3000);
        acc.getAccountInfo();
        acc.withdraw(2500);
        acc.getAccountInfo();
    }
}
