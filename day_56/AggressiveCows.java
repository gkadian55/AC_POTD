package day_56;

import java.util.*;

class Solution {
    public boolean isValid(int[] arr, int k, int distance) {
        int count = 1;
        int last = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[last] >= distance) {
                last = i;
                count++;
            }
            if (count == k) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int left = 1;
        int right = stalls[stalls.length-1] - stalls[0];
        int ans = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(stalls, k, mid)) {
                ans = mid;
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return ans;
    }
}
