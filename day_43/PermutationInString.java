package day_43;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            char ch = s1.charAt(i);
            str1[ch-'a']++;
        }
        for (int i = 0; i < len; i++) {
            char ch = s2.charAt(i);
            str2[ch-'a']++;
        }
        boolean allSame = true;
        for (int i = 0; i < 26; i++) {
            if (str1[i] != str2[i]) allSame = false;
        }
        if (allSame) return true;
        for (int i = len; i < s2.length(); i++) {
            char rem = s2.charAt(i-len);
            str2[rem-'a']--;
            char ch = s2.charAt(i);
            str2[ch-'a']++;
            allSame = true;
            for (int j = 0; j < 26; j++) {
                if (str1[j] != str2[j]) allSame = false;
            }
            if (allSame) return true;
        }
        return false;
    }
}
