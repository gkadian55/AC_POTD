package day_58;

class Solution {
    public int splits(int[] arr, int mid) {
        int count = 1;
        int sum = 0;
        for (int a : arr) {
            if (sum + a > mid) {
                count++;
                sum = a;
            }
            else sum += a;
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int left = nums[0];
        int right = nums[0];
        for (int i = 1; i < n; i++) {
            left = Math.max(left, nums[i]);
            right += nums[i];
        }
        int ans = left;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int splits = splits(nums, mid);
            if (splits <= k) {
                if (splits == k) ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }
}
