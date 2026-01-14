package day_34;

import java.util.*;

class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        boolean[] marked = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        for (int i = 0; i < n; i++) pq.add(new int[]{nums[i], i});
        long sum = 0;
        while (!pq.isEmpty()) {
            int[] min = pq.peek();
            if (!marked[min[1]]) {
                sum += min[0];
                marked[min[1]] = true;
                if (min[1] < n - 1) marked[min[1] + 1] = true;
                if (min[1] > 0) marked[min[1] - 1] = true;
            }
            pq.poll();
        }
        return sum;
    }
}
