package day_26;

import java.util.*;

class Solution {
    public String firstNonRepeating(String s) {
        StringBuilder sb = new StringBuilder();
        int[] frequency = new int[26];
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch - 'a']++;
            if (frequency[ch - 'a'] == 1) queue.add(ch);
            while (!queue.isEmpty() && frequency[queue.peek() - 'a'] > 1) {
                queue.poll();
            }
            if (queue.isEmpty()) sb.append('#');
            else sb.append(queue.peek());
        }
        return sb.toString();
    }
}
