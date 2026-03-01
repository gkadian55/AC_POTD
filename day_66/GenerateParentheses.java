package day_66;

import java.util.*;

class Solution {
    public void generate(int open, int close, StringBuilder sb, List<String> answer) {
        if (open == 0 && close == 0) {
            answer.add(sb.toString());
            return;
        }
        if (open > 0) {
            sb.append('(');
            generate(open-1, close, sb, answer);
            sb.deleteCharAt(sb.length()-1);
        }
        if (close > open) {
            sb.append(')');
            generate(open, close-1, sb, answer);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generate(n, n, sb, answer);
        return answer;
    }
}
