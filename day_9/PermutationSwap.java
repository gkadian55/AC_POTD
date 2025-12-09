package day_9;

import java.util.*;

public class PermutationSwap {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t > 0) {
            int n = sc.nextInt();
            int[] permutation = new int[n];
            int[] distance = new int[n];
            for (int i = 0; i < n; i++) {
                permutation[i] = sc.nextInt();
                distance[i] = Math.abs(permutation[i] - (i + 1));
            }
            int maxK = 0;
            for (int k : distance) maxK = gcd(maxK, k);
            sb.append(maxK).append("\n");
            t--;
        }
        System.out.print(sb);
        sc.close();
    }
}
