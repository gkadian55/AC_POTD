package day_42;

class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        int celebrity = 0;
        for (int i = 1; i < n; i++) {
            if (mat[celebrity][i] == 1) celebrity = i;
        }
        for (int i = 0; i < n; i++) {
            if (i == celebrity) continue;
            if (mat[celebrity][i] == 1 || mat[i][celebrity] == 0) return -1;
        }
        return celebrity;
    }
}
