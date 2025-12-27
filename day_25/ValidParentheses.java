package day_25;

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        int n = s.length();
        if (n % 2 == 1 || s.charAt(n-1) == '{' || s.charAt(n-1) == '[' || s.charAt(n-1) == '(') return false;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') chars.push(ch);
            else if ((ch == ']' || ch == '}' || ch == ')') && chars.isEmpty()) return false;
            else {
                if ((ch == ')' && chars.peek() == '(') || (ch == '}' && chars.peek() == '{') || (ch == ']' && chars.peek() == '[')) chars.pop();
                else return false;
            }
        }
        if (chars.isEmpty()) return true;
        return false;
    }
}