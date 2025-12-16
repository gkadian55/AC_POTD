package day_15;

import java.util.*;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        StringBuilder sb = new StringBuilder(Long.toString(x));
        for (int i = 0; i < sb.length(); i++) {
            int n = sb.charAt(i) - '0';
            if (n > 4) {
                if (i == 0 && n == 9) continue;
                n = 9 - n;
                sb.setCharAt(i, (char) (n + '0'));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
