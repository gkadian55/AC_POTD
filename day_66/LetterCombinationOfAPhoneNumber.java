package day_66;

import java.util.*;

class Solution {
    public void generate(String[] letters, String digits, int i, StringBuilder sb, List<String> answer) {
        if (i == digits.length()) {
            answer.add(sb.toString());
            return;
        }
        String str = letters[digits.charAt(i) - '0'];
        for (int j = 0; j < str.length(); j++) {
            sb.append(str.charAt(j));
            generate(letters, digits, i+1, sb, answer);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generate(letters, digits, 0, sb, answer);
        return answer;
    }
}
