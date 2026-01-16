package day_33;

import java.util.*;

class Solution {
    public int minValue(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            pq.add(entry.getValue());
        }
        while (k-- > 0) {
            pq.add(pq.poll() - 1);
        }
        int sum = 0;
        while (!pq.isEmpty()) sum += pq.peek() * pq.poll();
        return sum;
    }
}
