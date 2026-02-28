package day_63;

import java.util.*;

class Solution {
    public void subsetSum(int[] arr, ArrayList<Integer> answer, int i, int sum) {
        if (i == arr.length) {
            answer.add(sum);
            return;
        }
        sum += arr[i];
        subsetSum(arr, answer, i+1, sum);
        sum -= arr[i];
        subsetSum(arr, answer, i+1, sum);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        subsetSum(arr, answer, 0, 0);
        return answer;
    }
}
