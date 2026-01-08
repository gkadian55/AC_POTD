package day_37;

class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int j = i;
            if (j != 0) {
                while (j != 0) {
                    if ((j & 1) == 1) count++;
                    j = j >> 1;
                }
            }
            result[i] = count;
        }
        return result;
    }
}

/*  O(n) Solution
    class Solution {
        public int[] countBits(int n) {
            int[] result = new int[n+1];
            for (int i = 1; i <= n; i++) {
                result[i] = result[i >> 1] + (i & 1);
            }
            return result;
        }
    }
*/
