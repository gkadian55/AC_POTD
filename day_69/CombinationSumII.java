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
        generate(arr, x, i+1, sum, subset, answer);
        subset.remove(subset.size()-1);
        sum -= arr[i];
        while (i < arr.length-1 && arr[i] == arr[i+1]) i++;
        generate(arr, x, i+1, sum, subset, answer);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(candidates);
        generate(candidates, target, 0, 0, subset, answer);
        return answer;
    }
}
