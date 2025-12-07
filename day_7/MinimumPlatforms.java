package day_7;

import java.util.*;
import java.lang.Math;

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int len = arr.length;
        int count = 0, platforms = 0, i = 0, j = 0;
        while (i < len) {
            if (arr[i] <= dep[j]) {
                count++;
                platforms = Math.max(count, platforms);
                i++;
            }
            else {
                count--;
                j++;
            }
        }
        return platforms;
    }
}
