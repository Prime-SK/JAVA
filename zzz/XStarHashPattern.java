package zzz;
import java.util.Scanner;

public class XStarHashPattern {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while(num%2==0){
            System.out.print("enter an odd number : ");
            num = sc.nextInt();
            if(num%2==0){
                System.out.println("Invalid input");
            }
        }
        for(int i=0; i<num ;i++){
            for(int j=0;j<num;j++){
                if (i==j){
                    System.out.print("X ");
                }else 
                if(j==(num-1-i)){
                    System.out.print("# ");
                }else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
        // System.out.println(num);
        sc.close();
    }
}
/*
    x * * * #
    * x * # *
    * * x * *
    * # * x *
    # * * * x
 */