package day_44;

import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> answer = new ArrayList<>();
        long sumK = 0;
        int index = 0;
        for (int i = 0; i < k; i++) sumK += Math.abs(arr[i] - x);
        long minSum = sumK;
        for (int i = k; i < arr.length; i++) {
            sumK = sumK + Math.abs(arr[i] - x) - Math.abs(arr[i - k] - x);
            if (sumK < minSum) {
                minSum = sumK;
                index = i - k + 1;
            }
        }
        for (int i = index; i < index + k; i++) answer.add(arr[i]);
        return answer;
    }
}
