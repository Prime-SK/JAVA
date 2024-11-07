package zzz;
import java.util.Scanner;

public class qui {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] test = new int[T];
        for(int i=0; i<T; i++){
            test[i] = in.nextInt();
        }
        int prev = 1;
        int curr = 2;
        int next = 0;
        int sum = 2;
        // int prevsum = 2;
        for (int i : test) {
            prev = 1;
            curr = 2;
            next = 0;
            sum = 2;
            while(sum<=i){
                next = prev + curr;
                System.out.println(next);
                // System.err.println(next % 2);
                // sum += next;
                if (next % 2 == 0) {
                    sum += next;
                }
                prev = curr;
                curr = next;
            }
            System.out.println(sum);
            in.close();
        }
    }
}