package zzz;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] hurdles = new int[n];

        for(int i=0; i<n; i++){
            hurdles[i]=in.nextInt();
        }
        int max = hurdles[0];
        for (int i : hurdles) {
            if (i>max) {
                max=i;
            }
        }
        int magic = max - k;
        if (magic < 0) {
            magic = 0;
        }
        System.out.println(magic);
        in.close();
    }
}
