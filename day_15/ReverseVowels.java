package day_15;

import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder("");
        Stack<Character> vowels = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels.push(ch);
                sb.append("_");
            }
            else sb.append(ch);
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '_') {
                sb.setCharAt(i, vowels.pop());
            }
        }
        String result = sb.toString();
        return result;
    }
}