package day_23;

import java.util.*;

public class LuntikAndSubsequences {
    public static long exp2(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t-- > 0) {
            int n = sc.nextInt();
            long subarrays;
            int ones = 0;
            int zeroes = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == 0) zeroes++;
                else if (a == 1) ones++;
            }
            if (ones == 0) subarrays = 0;
            else subarrays = ones * exp2(zeroes);
            sb.append(subarrays + "\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
