package Reid;

import java.util.Scanner;

public class q1new {
    private static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int R, C;

    public static String playBattleships(int[][] grid, int[][] guesses) {
        int shipCount = countShips(grid);
        
        for (int[] guess : guesses) {
            int row = guess[0];
            int col = guess[1];
            if (grid[row][col] == 1) {
                shipCount--;
                if (shipCount == 0) {
                    return "Isuru";
                }
                sinkShip(grid, row, col);
            }
        }
        
        return "Dulaj";
    }

    private static int countShips(int[][] grid) {
        int count = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    sinkShip(grid, i, j);
                }
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == -1) {
                    grid[i][j] = 1;
                }
            }
        }
        return count;
    }

    private static void sinkShip(int[][] grid, int row, int col) {
        if (row < 0 || row >= R || col < 0 || col >= C || grid[row][col] != 1) {
            return;
        }
        grid[row][col] = -1;
        for (int[] dir : directions) {
            sinkShip(grid, row + dir[0], col + dir[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        R = sc.nextInt();
        C = sc.nextInt();
        int N = sc.nextInt();

        int[][] grid = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] guesses = new int[N][2];
        for (int i = 0; i < N; i++) {
            guesses[i][0] = sc.nextInt();
            guesses[i][1] = sc.nextInt();
        }

        String winner = playBattleships(grid, guesses);
        System.out.println(winner);
        
        sc.close();
    }
}
