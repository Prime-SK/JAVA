package Reid;
import java.util.*;

public class q2newnew {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();

        for (int query = 0; query < q; query++) {
            char s = scanner.next().charAt(0);
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            long[][] dp = new long[n + 1][m + 1];
            dp[0][0] = 1;
        
            for (int r = 0; r <= i; r++) {
                for (int c = 0; c <= j; c++) {
                    if (r > 0) {
                        dp[r][c] = (dp[r][c] + dp[r - 1][c]) % MOD;
                        if (s == 'D') {
                            dp[r][c] = (dp[r][c] + dp[r - 1][c]) % MOD;
                        }
                    }
                    if (c > 0) {
                        dp[r][c] = (dp[r][c] + dp[r][c - 1]) % MOD;
                        if (s == 'R') {
                            dp[r][c] = (dp[r][c] + dp[r][c - 1]) % MOD;
                        }
                    }
                }
            }
            System.out.println(dp[i][j]/2);
        }
        scanner.close();
    }
}

