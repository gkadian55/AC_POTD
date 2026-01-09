package day_27;

import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) answer.add(0);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) stack.pop();
            if (stack.isEmpty()) answer.set(i, i + 1);
            else answer.set(i, i - stack.peek());
            stack.push(i);
        }
        return answer;
    }
}
