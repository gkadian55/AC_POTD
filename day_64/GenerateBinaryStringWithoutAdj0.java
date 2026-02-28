package day_64;

import java.util.*;

class Solution {
    public void strings(int n, int i, StringBuilder sb, List<String> answer) {
        if (i > 1) {
            if (sb.charAt(i-1) == '0' && sb.charAt(i-2) == '0') return;
        }
        if  (i == n) {
            answer.add(sb.toString());
            return;
        }
        sb.append('0');
        strings(n, i+1, sb, answer);
        sb.deleteCharAt(i);
        sb.append('1');
        strings(n, i+1, sb, answer);
        sb.deleteCharAt(i);
    }
    public List<String> validStrings(int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        strings(n, 0, sb, answer);
        return answer;
    }
}
