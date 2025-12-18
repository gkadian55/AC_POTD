package day_17;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        String[] sorted = new String[n];
        for (int i = 0; i < n; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            sorted[i] = new String(ch);
        }
        boolean[] used = new boolean[n];
        List<List<String>> groupAnagram = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (used[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;
            for (int j = i + 1; j < n; j++) {
                if (!used[j] && sorted[i].equals(sorted[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }
            groupAnagram.add(group);
        }
        return groupAnagram;
    }
}