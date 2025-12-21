package day_20;

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        if (n > 2) {
            int[] arr = new int[n];
            for (int i = 2; i < n; i++) arr[i] = 1;
            for (int i = 2; i < n; i++) {
                if (arr[i] == 1) {
                    count++;
                    for (int j = i; j < n; j = j + i) {
                        if (i == j) continue;
                        arr[j] = 0;
                    }
                }
            }
        }
        return count;
    }
}
