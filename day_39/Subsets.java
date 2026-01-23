package day_39;

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
}
