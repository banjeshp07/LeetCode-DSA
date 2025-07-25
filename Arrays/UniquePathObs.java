package Arrays;

import java.util.Arrays;

public class UniquePathObs {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1); // -1 means not solved yet
        }

        return countPaths(m - 1, n - 1, obstacleGrid, dp);
    }

    public static int countPaths(int i, int j, int[][] obstacleGrid, int[][] dp) {
        // Out of bounds
        if (i < 0 || j < 0) return 0;

        // Obstacle encountered
        if (obstacleGrid[i][j] == 1) return 0;

        // Reached start point
        if (i == 0 && j == 0) return 1;

        // Already computed
        if (dp[i][j] != -1) return dp[i][j];

        // Try top and left cells
        int up = countPaths(i - 1, j, obstacleGrid, dp);
        int left = countPaths(i, j - 1, obstacleGrid, dp);

        return dp[i][j] = up + left;
    }
    
    public static void main(String[] args) {
        int[][] obstacleGrid = {
        {0, 0, 0},
        {0, 1, 0},
        {0, 0, 0}
        };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}

