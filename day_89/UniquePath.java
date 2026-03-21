package day_89;

import java.util.*;

class Solution {
    int[][] dp;
    public int simulate(int m, int n) {
        if (m == 0 && n == 0) return 1;
        if (m < 0 || n < 0) return 0;
        if (dp[m][n] != -1) return dp[m][n];
        int paths = 0;
        paths += simulate(m-1, n) + simulate(m, n-1);
        return dp[m][n] = paths;
    }
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        return simulate(m-1, n-1);
    }
}
