package day_57;

class Solution {
    public int divsum(int[] arr, int div) {
        int value = 0;
        for (int a : arr) {
            if (a % div == 0) value += a / div;
            else value += a / div + 1;
        }
        return value;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = nums[0];
        for (int i = 1; i < nums.length; i++) right = Math.max(right, nums[i]);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int expected = divsum(nums, mid);
            if (expected <= threshold) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
}
