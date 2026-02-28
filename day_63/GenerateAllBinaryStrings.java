package day_63;

import java.util.*;

class Solution {
    public void strings(String s, StringBuilder sb, int i, List<String> answer) {
        if (i == s.length()) {
            answer.add(sb.toString());
            return;
        }
        if (s.charAt(i) == '?') {
            sb.append(0);
            strings(s, sb, i+1, answer);
            sb.deleteCharAt(i);
            sb.append(1);
            strings(s, sb, i+1, answer);
            sb.deleteCharAt(i);
        }
        else {
            sb.append(s.charAt(i));
            strings(s, sb, i+1, answer);
            sb.deleteCharAt(i);
        }
    }
    public List<String> generate_binary_string(String s) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        strings(s, sb, 0, answer);
        return answer;
    }
}
