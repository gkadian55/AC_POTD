package day_55;

class Solution {
    public int expected(int[] arr, int cap) {
        int time = 1;
        int load = 0;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > cap) {
                time++;
                load = arr[i];
            }
            else load += arr[i];
        }
        return time;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = weights[0];
        int right = weights[0];
        for (int i = 1; i < weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int expected = expected(weights, mid);
            if (expected <= days) {
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return left;
    }
}
