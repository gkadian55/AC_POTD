package day_62;

import java.util.*;

class Solution {
    public void powerSet(int[] nums, List<Integer> subset, List<List<Integer>> answer, int i) {
        if (i == nums.length) {
            answer.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        powerSet(nums, subset, answer, i+1);
        subset.remove(subset.size()-1);
        powerSet(nums, subset, answer, i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        powerSet(nums, subset, answer, 0);
        return answer;
    }
}