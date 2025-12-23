package day_22;

import java.util.*;

public class ThreePairwiseMaximums {
    public static int maximum(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c && b >= a) return b;
        else return c;
    }
    public static int minimum(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        if (b <= c && b <= a) return b;
        else return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if ((x == y && y == z) || (x == y && x > z) || (x == z && x > y) || (y == z && y > x)) {
                sb.append("YES\n");
                sb.append(maximum(x,y,z) + " " + minimum(x,y,z) + " " + minimum(x,y,z) + "\n");
            } 
            else sb.append("NO\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
