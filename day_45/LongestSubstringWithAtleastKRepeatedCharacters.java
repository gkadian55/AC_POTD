package day_45;

class Solution {
    public int longestSubstring(String s, int k) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i) - 'a']++;
        int i = 0;
        int max = 0;
        boolean split = false;
        for (int j = 0; j < s.length(); j++) {
            if (freq[s.charAt(j) - 'a'] > 0 && freq[s.charAt(j) - 'a'] < k) {
                String sub = s.substring(i, j);
                max = Math.max(max, longestSubstring(sub, k));
                split = true;
                i = j + 1;
            }
        }
        if (!split) return s.length();
        return Math.max(max, longestSubstring(s.substring(i), k));
    }
}
