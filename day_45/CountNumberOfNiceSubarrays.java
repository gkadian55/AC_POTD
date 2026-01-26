package day_45;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] % 2;
        }
        int[] prefix = new int[n+1];
        for (int i = 1; i < n+1; i++) prefix[i] = prefix[i-1] + nums[i-1];
        int count = 0;
        int i = 0;
        int j = 1;
        while (j < n+1) {
            if (prefix[j] - prefix[i] == k) {
                int end = j;
                while (end < n+1 && prefix[end] == prefix[j]) {
                    count++;
                    end++;
                }
                i++;
            }
            else if (prefix[j] - prefix[i] < k) j++;
            else i++;
        }
        return count;
    }
}
