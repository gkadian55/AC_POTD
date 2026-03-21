package day_89;

import java.util.*;

class Solution {
    int[][] dp;
    public int minSum(int[][] grid, int i, int j) {
        if (i == 0 && j == 0) return grid[0][0];
        if (i < 0 || j < 0) return 1000000001;
        if (dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = Math.min(grid[i][j] + minSum(grid, i-1, j), grid[i][j] + minSum(grid, i, j-1));
    }
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        for (int[] row : dp) Arrays.fill(row, -1);
        return minSum(grid, grid.length-1, grid[0].length-1);
    }
}
