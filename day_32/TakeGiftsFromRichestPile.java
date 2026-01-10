package day_32;

import java.util.*;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length - 1;
        while (k-- > 0) {
            Arrays.sort(gifts);
            gifts[n] = (int) Math.sqrt(gifts[n]);
        }
        long sum = 0;
        for (int a : gifts) sum += a;
        return sum;
    }
}
