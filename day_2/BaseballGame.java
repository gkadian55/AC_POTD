package day_2;

import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        int value, sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                value = scores.get((scores.size())-1) + scores.get((scores.size())-2);
                scores.push(value);
            }
            else if (operations[i].equals("D")) {
                value = 2 * scores.get((scores.size())-1);
                scores.push(value);
            }
            else if (operations[i].equals("C")) {
                scores.pop();
            }
            else {
                scores.push(Integer.parseInt(operations[i]));
            }
        }
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
        }
        return sum;
    }
}
