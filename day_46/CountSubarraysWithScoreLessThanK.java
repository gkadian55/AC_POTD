package day_46;

class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long count = 0;
        long[] prefix = new long[n+1];
        for (int i = 1; i < n+1; i++) prefix[i] = prefix[i-1] + nums[i-1];
        int i = 0;
        int j = 1;
        while (j < n + 1) {
            long score = (prefix[j] - prefix[i]) * (j - i);
            if (score < k) {
                count = count + j - i;
                j++;
            }
            else i++;
        }
        return count;
    }
}
