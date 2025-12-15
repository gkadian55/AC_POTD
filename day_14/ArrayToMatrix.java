package day_14;

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n == original.length) {
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = original[i * n + j];
                }
            }
            return matrix;
        }
        else {
            int[][] matrix = {};
            return matrix;
        }
    }
}
