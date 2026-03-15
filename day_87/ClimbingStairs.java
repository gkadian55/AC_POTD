package day_87;

import java.util.*;

class Solution {
    static int[] dp = new int[46];
    static {
        Arrays.fill(dp, -1);
    }
    public int climbStairs(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (dp[n] != -1) return dp[n];
        return dp[n] = climbStairs(n-1) + climbStairs(n-2);
    }
}
