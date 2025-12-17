package day_16;

import java.util.*;

class Solution {
    public String reverseWords(String s) {
        s = s + " ";
        Stack<String> words = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String word = "";
            while (!(s.substring(i, i + 1).equals(" "))) {
                word += s.substring(i, i + 1);
                i++;
            }
            if (word.equals("")) continue;
            words.push(word);
        }
        StringBuilder sb = new StringBuilder("");
        int n = words.size();
        for (int i = 0; i < n; i++) {
            sb.append(words.pop());
            if (i != n - 1) sb.append(" ");
        }
        String reverse = sb.toString();
        return reverse;
    }
}