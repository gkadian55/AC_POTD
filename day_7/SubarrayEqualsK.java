package day_7;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum, count = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            sum = 0;
            for (int j = i; j < len; j++) {
                sum += nums[j];
                if (sum == k) count++;
            }
        }
        return count;
    }
}
