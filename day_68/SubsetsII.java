package day_68;

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
        while (i+1 < nums.length && nums[i] == nums[i+1]) i++;
        powerSet(nums, subset, answer, i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        powerSet(nums, subset, answer, 0);
        return answer;
    }
}
