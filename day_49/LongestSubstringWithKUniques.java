package day_49;

class Solution {
    public int distinct(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) ans++;
        }
        return ans;
    }
    public int longestKSubstr(String s, int k) {
        int[] freq = new int[26];
        int max = -1;
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            freq[s.charAt(j) - 'a']++;
            while (distinct(freq) > k) {
                freq[s.charAt(i) - 'a']--;
                i++;
            }
            if (distinct(freq) == k) max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}
