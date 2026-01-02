package day_31;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int warmer = 0;
            for (int j = i; j < n; j++) {
                if (temperatures[i] < temperatures[j]) {
                    warmer = j - i;
                    break;
                }
            }
            answer[i] = warmer;
        }
        answer[n-1] = 0;
        return answer;
    }
}
