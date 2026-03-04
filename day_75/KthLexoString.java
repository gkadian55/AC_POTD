package day_75;

import java.util.*;

class Solution {
    public void generate(int n, char[] abc, StringBuilder sb, List<String> answer) {
        if (sb.length() == n) {
            answer.add(sb.toString());
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (sb.length() > 0 && sb.charAt(sb.length()-1) == abc[i]) continue;
            sb.append(abc[i]);
            generate(n, abc, sb, answer);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public String getHappyString(int n, int k) {
        char[] abc = {'a', 'b', 'c'};
        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();
        generate(n, abc, sb, answer);
        if (k > answer.size()) return "";
        return answer.get(k-1);
    }
}
