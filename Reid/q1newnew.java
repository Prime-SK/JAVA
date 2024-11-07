package Reid;
import java.util.Scanner;

public class q1newnew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
        
        int[][] grid = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int shipCount = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    if ((i == 0 || grid[i-1][j] == 0) && (j == 0 || grid[i][j-1] == 0)) {
                        shipCount++;
                    }
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (grid[row][col] == 1) {
                shipCount--;
                if (shipCount == 0) {
                    System.out.println("Isuru");
                    sc.close();
                    return;
                }
            }
        }
        
        System.out.println("Dulaj");
        sc.close();
    }
}