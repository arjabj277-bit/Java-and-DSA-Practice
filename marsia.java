public class marsia {
    static int[][] dp = new int[101][101];
    static int solve(int c1, int c2) {
        if (dp[c1][c2] != -1) {
            return dp[c1][c2];
        }
        int ans = 0;
        if (c1 >= 1 && c2 >= 1) {
            ans = Math.max(ans, 1 + solve(c1 - 1, c2 - 1));
        }
        if (c1 >= 3) {
            ans = Math.max(ans, 1 + solve(c1 - 3, c2));
        }
        if (c2 >= 3) {
            ans = Math.max(ans, 1 + solve(c1, c2 - 3));
        }

        return dp[c1][c2] = ans;
    }
    
    }
