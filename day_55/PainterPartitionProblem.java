package day_55;

class Solution {
    public int painters(int[] arr, int time) {
        int count = 1;
        int covered = 0;
        for (int i = 0; i < arr.length; i++) {
            if (covered + arr[i] > time) {
                covered = arr[i];
                count++;
            }
            else covered += arr[i];
        }
        return count;
    }
    public int minTime(int[] arr, int k) {
        int left = arr[0];
        int right = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left = Math.max(left, arr[i]);
            right += arr[i];
        }
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int expected = painters(arr, mid);
            if (expected <= k) {
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }
}

