package HR;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag = true;

        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}
