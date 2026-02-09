package day_59;

class Solution {
    public long operations(int[] arr, int k) {
        long count = 0;
        for (int a : arr) {
            if (a > k) {
                if (a % k == 0) count += (a / k) - 1;
                else count += (a / k);
            }
        }
        return count;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = nums[0];
        for (int a : nums) {
            right = Math.max(a, right);
        }
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long expected = operations(nums, mid);
            if (expected <= maxOperations) {
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }
}
