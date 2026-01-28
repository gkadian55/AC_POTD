package day_52;

class Solution {
    public boolean binary(int[] arr, int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) return true;
            if (arr[mid] > key) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int pivot = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i-1]) {
                pivot = i;
                break;
            }
        }
        return (binary(nums, 0, pivot-1, target) || binary(nums, pivot, n-1, target));
    }
}
