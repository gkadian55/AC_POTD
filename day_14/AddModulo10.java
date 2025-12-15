package day_14;

import java.util.*;

public class AddModulo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t > 0) {
            int n = sc.nextInt();
            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                if (a % 10 == 5) array[i] = (a + 5) % 20;
                else array[i] = a % 20;
            }
            boolean holds = true;
            
            if (holds) sb.append("YES\n");
            else sb.append("NO\n");
            t--;
        }
        System.out.println(sb);
        sc.close();
    }
}
