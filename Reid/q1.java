package Reid;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
    
        int arr[][] = new int[R][C];
    
        for(int i = 0 ; i<R ; i++){
            for(int j = 0 ; j<C ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int guess[][] = new int[N][2];
        for(int i = 0 ; i<N ; i++){
            guess[i][0] = sc.nextInt();
            guess[i][1] = sc.nextInt();
        }
        sc.close();
        int noOfShips = 0;
        for (int[] row : arr) {
            for (int s : row) {
                if (s==1) {
                    noOfShips++;
                }
            }
        }
        for (int[] g : guess) {
            int row = g[0];
            int col = g[1];
            if (arr[row][col] == 1) {
                noOfShips-- ;
            }
        }
        if (noOfShips == 0) {
            System.out.println("Isuru");
        }else{
            System.out.println("Dulaj");
        }
    }
}
