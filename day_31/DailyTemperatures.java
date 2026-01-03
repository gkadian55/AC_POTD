package day_31;

import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> days = new Stack<>();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            while (!days.isEmpty() && temperatures[i] > temperatures[days.peek()]) {
                int previousDay = days.pop();
                answer[previousDay] = i - previousDay;
            }
            days.push(i);
        }
        return answer;
    }
}