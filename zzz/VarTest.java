package zzz;
import java.util.Scanner;

public class VarTest {
    public static void main(String[] args) {
        /*int iNum;
        char cVal;
        Boolean bVal;*/ //cannot display uninitialzed variables

        int iNum = 25;
        char cVal = 'B';
        Boolean bVal = true;

        System.out.println(iNum);
        System.out.println(cVal);
        System.out.println(bVal);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        
        int value = scan.nextInt();
        System.out.println(value);

        scan.close();
    }
}
