package day_6;

public class RemoveParentheses {
    class Solution {
        public String removeOuterParentheses(String s) {
            String ch, result = "";
            int len = s.length(), count = 0;
            for (int i = 0; i < len; i++){
                ch = s.substring(i, i + 1);
                if (ch.equals("(")) {
                    if (count > 0) result += ch;
                    count++;
                }
                else {
                    count--;
                    if (count > 0) result += ch;
                }
            }
            return result;
        }
    }
}
