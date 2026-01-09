package day_38;

class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        int[] xorValues = new int[arr.length];
        xorValues[0] = arr[0];
        for (int i = 1; i < xorValues.length; i++) xorValues[i] = xorValues[i-1] ^ arr[i];
        for (int i = 0; i < queries.length; i++) {
            int low = queries[i][0];
            int high = queries[i][1];
            if (low == 0) result[i] = xorValues[high];
            else result[i] = xorValues[low - 1] ^ xorValues[high];
        }
        return result;
    }
}
