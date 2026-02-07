package day_56;

class Solution {
    public boolean isPossible(int[] ranks, int cars, long time) {
        int fixed = 0;
        for (int a : ranks) {
            fixed += Math.sqrt(time / a);
            if (fixed >= cars) return true;
        }
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long min = ranks[0];
        for (int i = 1; i < ranks.length; i++) min = Math.min(min, ranks[i]);
        long right = (long) cars * cars * min;
        long ans = -1;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (isPossible(ranks, cars, mid)) {
                ans = mid;
                right = mid - 1; 
            }
            else left = mid + 1;
        }
        return ans;
    }
}
