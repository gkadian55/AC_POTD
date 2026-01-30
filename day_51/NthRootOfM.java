package day_51;

class Solution {
    public int nthRoot(int n, int m) {
        if (m < 2) return m;
        int left = 1;
        int right = m / n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.pow(mid, n) >= m) {
                if (Math.pow(mid, n) == m) return mid;
                else right = mid - 1;
            }
            else left = mid + 1;
        }
        return -1;
    }
}
