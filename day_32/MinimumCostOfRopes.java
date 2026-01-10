package day_32;

import java.util.*;

class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a : arr) pq.add(a);
        int cost = 0;
        while (pq.size() != 1) {
            int ropeOne = pq.poll();
            int ropeTwo = pq.poll();
            pq.add(ropeOne + ropeTwo);
            cost += ropeOne + ropeTwo;
        }
        return cost;
    }
}
