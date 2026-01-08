package day_36;

class Solution {
    public int[] singleNum(int[] arr) {
        int[] answer = new int[2];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        int bit = 1;
        while ((result & bit) == 0) bit = bit << 1;
        for (int a : arr) {
            if ((a & bit) == 0) answer[0] = answer[0] ^ a;
            else answer[1] = answer[1] ^ a;
        }
        if (answer[0] > answer[1]) {
            int temp = answer[0];
            answer[0] = answer[1];
            answer[1] = temp;
        }
        return answer;
    }
}
