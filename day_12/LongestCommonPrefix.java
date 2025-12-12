package day_12;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String smallest = strs[0];
        String prefix = "";
        for (String a : strs) {
            if (a.length() < smallest.length()) smallest = a;
        }
        if (smallest.equals("")) {
            prefix = "";
        }
        else {
            for (int i = 0; i < smallest.length(); i++) {
                char ch = smallest.charAt(i);
                boolean allMatch = true;
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) != ch) {
                        allMatch = false;
                        break;
                    }
                }
                if (!allMatch) break;
                prefix += ch;
            }
        }
        return prefix;
    }
}