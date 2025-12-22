package day_21;

import java.util.*;

public class TwinPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = n + 1 - a[i];
                sb.append(b[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
