package P23;

public class checkPrime {
    public static void main(String[] args) {
        int i, f = 0;
        int n = Integer.parseInt(args[0]);
        // int m = Integer.parseInt(args[1]);
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                f = 1;
                break;
            }
        }
        if (f==0) {
            System.out.println("Prime");
        } else {
            f=0;
            System.out.println("Not Prime");
        }

        // for (i = 2; i <= m / 2; i++) {
        //     if (m % i == 0) {
        //         f = 1;
        //         break;
        //     }
        // }
        // if (f==0) {
        //     System.out.println("Prime");
        // } else {
        //     System.out.println("Not Prime");
        // }
    }
}
