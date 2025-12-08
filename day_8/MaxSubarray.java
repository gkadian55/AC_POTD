package day_8;

import java.lang.Math;

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < len; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}