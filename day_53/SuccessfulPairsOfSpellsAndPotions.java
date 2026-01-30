package day_53;

import java.util.*;

class Solution {
    public int potions(int spell, int[] potions, long success) {
        int left = 0;
        int right = potions.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) potions[mid] * spell >= success) {
                if (mid == 0) return potions.length;
                else if ((long) potions[mid-1] * spell < success) return potions.length - mid;
                else right = mid-1;
            }
            else left = mid+1;
        }
        return 0;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        Arrays.sort(potions);
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = potions(spells[i], potions, success);
        }
        return answer;
    }
}
