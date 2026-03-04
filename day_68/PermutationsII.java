package day_68;

import java.util.*;

class Solution {
    public void generate(int[] nums, boolean[] marked, List<Integer> perm, List<List<Integer>> answer) {
        if (perm.size() == nums.length) {
            answer.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!marked[i]) {
                if (i > 0 && nums[i] == nums[i - 1] && !marked[i - 1]) continue;
                perm.add(nums[i]);
                marked[i] = true;
                generate(nums, marked, perm, answer);
                marked[i] = false;
                perm.remove(perm.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] marked = new boolean[nums.length];
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        generate(nums, marked, perm, answer);
        return answer;
    }
}
