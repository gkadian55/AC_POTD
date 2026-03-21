package day_88;

import java.util.*;

class Solution {
    int[] dp;
    int MOD = 1000000007;
    public int dice(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (dp[n] != -1) return dp[n];
        long ans = 0;
        for (int i = 1; i <= 6; i++) {
            ans = (ans + dice(n - i)) % MOD;
        }
        return dp[n] = (int) ans;
    }

    public void combination(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int result = dice(n);
        System.out.println(result);
    }
}
