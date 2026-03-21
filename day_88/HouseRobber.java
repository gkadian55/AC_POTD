package day_88;

import java.util.*;

class Solution {
    int[] dp;
    public int heist(int i, int[] nums) {
        if (i >= nums.length) return 0;
        if (dp[i] != -1) return dp[i];
        return dp[i] = Math.max(nums[i] + heist(i+2, nums), heist(i+1, nums));
    }
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return heist(0, nums);
    }
}
