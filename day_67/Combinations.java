package day_67;

import java.util.*;

class Solution {
    public void generate(int n, int i, int k, List<Integer> subset, List<List<Integer>> answer) {
        if (subset.size() == k) {
            answer.add(new ArrayList<>(subset));
            return;
        }
        if (i > n) return;
        if (subset.size() + (n - i + 1) < k) return;
        subset.add(i);
        generate(n, i+1, k, subset, answer);
        subset.remove(subset.size()-1);
        generate(n, i+1, k, subset, answer);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        generate(n, 1, k, subset, answer);
        return answer;
    }
}
