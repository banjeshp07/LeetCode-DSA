package Arrays;
import java.util.*;
public class UniquePath {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1); // -1 means not calculated yet
        }
        return countPaths(m - 1, n - 1, dp);
    }

    public static int countPaths(int i, int j, int[][] dp) {
        if(i < 0 || j < 0) return 0;         // Out of bounds
        if(i == 0 && j == 0) return 1;       // Reached start point

        if(dp[i][j] != -1) return dp[i][j];  // Already solved

        int up = countPaths(i - 1, j, dp);   // Move up
        int left = countPaths(i, j - 1, dp); // Move left

        dp[i][j] = up + left;                // Store result
        return dp[i][j];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(uniquePaths(m, n));
    }
}

