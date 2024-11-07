package p1;

public class accTest {
    public static void main(String[] args) {
        // SavAcc obj1 = new SavAcc("123", "John", 1000);
        // FDacc obj2 = new FDacc("456", "Jane", 2000);
        // obj1.deposit(500);
        // obj1.witdraw(200);
        // obj1.display();
        // System.out.println("Interest: " + obj1.calInterest());
        // obj2.setRate(5);
        // obj2.display();
        // System.out.println("Interest: " + obj2.calInterest());

        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
