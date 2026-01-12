package day_33;

import java.util.*;

class KthLargest {
    PriorityQueue<Integer> pq;
    int K;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        K = k;
        for (int a : nums) {
            pq.add(a);
            if (pq.size() > k) pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if (pq.size() > K) pq.poll();
        return pq.peek();
    }
}
