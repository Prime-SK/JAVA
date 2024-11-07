package EX;

import java.util.Scanner;

public class leapYr {
    public static boolean checkLeapYr(int yr){
        if(yr%400==0){
            return true;
        }else if (yr%4==0 && yr%100!=0) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int yr = sc.nextInt();

        boolean flag = checkLeapYr(yr);

        if (flag) {
            System.out.println("meka leap");
        }else{
            System.out.println("leap newei");
        }
        sc.close();
    }
}
