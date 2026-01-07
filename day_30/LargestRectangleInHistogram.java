package day_30;

import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stp = new Stack<>();
        int[] pse = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stp.isEmpty() && heights[stp.peek()] >= heights[i]) {
                stp.pop();
            }
            if (stp.isEmpty()) pse[i] = -1;
            else pse[i] = stp.peek();
            stp.push(i);
        }
        Stack<Integer> stn = new Stack<>();
        int[] nse = new int[n];
        for (int i = n-1; i >= 0; i--) {
            while (!stn.isEmpty() && heights[stn.peek()] >= heights[i]) {
                stn.pop();
            }
            if (stn.isEmpty()) nse[i] = n;
            else nse[i] = stn.peek();
            stn.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, heights[i] * (nse[i] - pse[i] - 1));
        }
        return maxArea;
    }
}
