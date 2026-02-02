package day_59;

import java.util.*;

class Solution {
    public long time (int[] array, int k) {
        long time = 0;
        for (int i = 0; i < array.length; i++) {
            time += (array[i] + k - 1) / k;
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int left = 1;
        int right = piles[n-1];
        int ans = piles[n-1];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (time(piles, mid) <= h) {
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
    }
}
