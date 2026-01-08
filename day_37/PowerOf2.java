package day_37;

class Solution {
    public static boolean isPowerofTwo(int n) {
        int count = 0;
        while (n != 0 && count < 2) {
            if ((n & 1) == 1) count++;
            n = n >> 1;
        }
        if (count == 1) return true;
        return false;
    }
}

/*  O(1) Method
    class Solution {
        public static boolean isPowerofTwo(int n) {
            return (n & (n - 1)) == 0;
        }
    }
*/
