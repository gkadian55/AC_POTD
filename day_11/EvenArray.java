package day_11;

import java.util.*;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int wrong0 = 0, wrong1 = 0;
            int swaps = -1;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                arr[i] = a % 2;
                if (i % 2 != arr[i]) {
                    if (arr[i] == 0) wrong0++;
                    else wrong1++;
                }
            }
            if (wrong0 == wrong1) swaps = wrong0;
            sb.append(swaps).append("\n");
            t--;
        }
        System.out.println(sb);
        sc.close();
    }
}
