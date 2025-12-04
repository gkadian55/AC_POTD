package day_4;

import java.util.*;

public class NextScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int count = 0, key = scores[k - 1];
        for (int i = 0; i < n; i++) {
            if (scores[i] >= key && scores[i] > 0) count++;
            if (scores[i] < key) break;
        }
        System.out.print(count);
        sc.close();
    }
}
