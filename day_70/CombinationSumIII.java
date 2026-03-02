package day_70;

import java.util.*;

class Solution {
    public void generate(int i, int k, int sum, int n, List<Integer> subset, List<List<Integer>> answer) {
        if (sum > n || i > 10) return;
        if (subset.size() == k) {
            if (sum == n) answer.add(new ArrayList<>(subset));
            return;
        }
        subset.add(i);
        generate(i+1, k, sum+i, n, subset, answer);
        subset.remove(subset.size()-1);
        generate(i+1, k, sum, n, subset, answer);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        generate(1, k, 0, n, subset, answer);
        return answer;
    }
}
