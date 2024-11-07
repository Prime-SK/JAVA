package zzz;
import java.util.Scanner;

public class quizq3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] test = new int[T];
        for (int i = 0; i < T; i++) {
            test[i] = in.nextInt();
        }

        for (int limit : test) {
            int prev = 1;
            int curr = 2;
            int sum = 0;

            while (curr <= limit) {
                if (curr % 2 == 0) {
                    sum += curr;
                }
                System.out.print(curr + " ");
                int next = prev + curr;
                prev = curr;
                curr = next;
            }
            System.out.println();
            System.out.println(sum);
            in.close();
        }
    }
}
// 0 1 1t 2f 3s 5 8 13 21 34