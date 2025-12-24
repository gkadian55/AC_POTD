package day_23;

class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = 0;
            for (int j = i; j < n; j++) {
                if (boxes.charAt(j) == '1') left += (j - i);
            }
            for (int j = i; j >= 0; j--) {
                if (boxes.charAt(j) == '1') right += (i - j);
            }
            answer[i] = left + right;
        }
        return answer;
    }
}
