package day_27;

import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) result.add(0);
        for (int i = n-1; i >= 0; i--) {
            int j = i;
            while (j == i) {
                if (stack.isEmpty()) {
                    result.set(i, -1);
                    j--;
                }
                else if (stack.peek() > arr[i]) {
                    result.set(i, stack.peek());
                    j--;
                }
                else stack.pop();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
