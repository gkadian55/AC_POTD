package day_4;

public class GCDofArray {
    class Solution {
        public int findGCD(int[] nums) {
            int gcd = 1, min = 1000, max = 1, len = nums.length;
            for (int i = 0; i < len; i++){
                if (nums[i] > max) max = nums[i];
                if (nums[i] < min) min = nums[i];
            }
            for (int i = min; i > 0; i--) {
                if ((min % i == 0) && (max % i == 0)) {
                    gcd = i;
                    break;
                }
            }
            return gcd;
        }
    }
}
