package zzz;

import java.util.Scanner;

public class staticInitBlock {
    static int B;
    static int H;
    static boolean flag = true;
    
    static {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
