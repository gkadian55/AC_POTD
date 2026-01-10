package day_32;

import java.util.*;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : gifts) pq.add(a);
        while (k-- > 0) pq.add((int) Math.sqrt(pq.poll()));
        long sum = 0;
        for (int a : pq) sum += a;
        return sum;
    }
}
