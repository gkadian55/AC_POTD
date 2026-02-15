package day_62;

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int length = answer.size();
            for (int j = 0; j < length; j++) {
                List<Integer> element = new ArrayList<>(answer.get(j));
                element.add(value);
                answer.add(element);
            }
        }
        return answer;
    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> subset = subsets(nums);
        int ans = 0;
        for (int i = 0; i < subset.size(); i++) {
            List<Integer> sub = subset.get(i);
            int xor = 0;
            for (int j = 0; j < sub.size(); j++) {
                xor ^= sub.get(j);
            }
            ans += xor;
        }
        return ans;
    }
}
