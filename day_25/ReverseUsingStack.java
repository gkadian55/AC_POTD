package day_25;

import java.util.*;

class Solution {
    public String reverse(String S) {
        Stack<Character> chars = new Stack<>();
        int n = S.length();
        for (int i = 0; i < n; i++) {
            chars.push(S.charAt(i));
        }
        StringBuilder reverse = new StringBuilder("");
        while (n > 0) {
            reverse.append(chars.pop());
            n--;
        }
        return reverse.toString();
    }
}
