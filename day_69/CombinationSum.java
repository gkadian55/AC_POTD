package day_69;

import java.util.*;

class Solution {
    public void generate(int[] arr, int x, int i, int sum, List<Integer> subset, List<List<Integer>> answer) {
        if (sum == x) {
            answer.add(new ArrayList<>(subset));
            return;
        }
        if (sum > x || i == arr.length) return;
        subset.add(arr[i]);
        sum += arr[i];
        generate(arr, x, i, sum, subset, answer);
        subset.remove(subset.size()-1);
        sum -= arr[i];
        generate(arr, x, i+1, sum, subset, answer);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        generate(candidates, target, 0, 0, subset, answer);
        return answer;
    }
}
