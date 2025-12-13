package day_13;

import java.util.*;

public class SpiralOrder {
    public static void main(){
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> spiral = new ArrayList<>();
        int i = 0, j = 0;
        while (j < cols) {
            spiral.add(matrix[i][j]);
            j++;
        }
        j--;
        i++;
        while (i < rows) {
            spiral.add(matrix[i][j]);
            i++;
        }
        i--;
        j--;
        while (j >= 0) {
            spiral.add(matrix[i][j]);
            j--;
        }
        j++;
        i--;
        while (i > 0) {
            spiral.add(matrix[i][j]);
            i--;
        }
        i++;
        j++;
        while (j < 2) {
            spiral.add(matrix[i][j]);
            j++;
        }
        System.out.println(spiral);
    }
}
