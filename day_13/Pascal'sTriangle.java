package day_13;

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) row.add(1);
                else {
                    int sumElement = pascal.get(i - 1).get(j) + pascal.get(i - 1).get(j - 1);
                    row.add(sumElement);
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}
