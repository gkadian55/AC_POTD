package day_62;

class Solution {
    public int powerSetXOR(int[] nums, int i, int xor) {
        if (i == nums.length) {
            return xor;
        }
        xor = xor ^ nums[i];
        int include = powerSetXOR(nums, i+1, xor);
        xor = xor ^ nums[i];
        int exclude = powerSetXOR(nums, i+1, xor);
        return include + exclude;
    }
    public int subsetXORSum(int[] nums) {
        return powerSetXOR(nums, 0, 0);
    }
}