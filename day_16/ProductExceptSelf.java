package day_16;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int product = 1, countZero = 0;
        for (int a : nums) {
            if (a != 0) product *= a;
            else countZero++;
        }
        if (countZero > 1) {
            for (int i = 0; i < n; i++) result[i] = 0;
        }
        else if (countZero == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) result[i] = product;
                else result[i] = 0;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                result[i] = product/nums[i];
            }
        }
        return result;
    }
}
