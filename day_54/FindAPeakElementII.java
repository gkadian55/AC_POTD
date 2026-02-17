package day_54;

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] answer = new int[2];
        boolean found = false;
        int rows = mat.length;
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int val = mat[i][j];
                int left = (j == 0) ? -1 : mat[i][j-1];
                int right = (j == cols-1) ? -1 : mat[i][j+1];
                int up = (i == 0) ? -1 : mat[i-1][j];
                int down = (i == rows-1) ? -1 : mat[i+1][j];
                if (val > left && val > right && val > up && val > down) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
            if (found) break;
        }
        return answer;
    }
}
