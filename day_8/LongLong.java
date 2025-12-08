package day_8;

import java.util.*;
import java.lang.Math;

public class LongLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();
        int n, op, a;
        long sum;
        boolean inNegative;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            sum = 0;
            op = 0;
            inNegative = false;
            for (int j = 0; j < n; j++) {
                a = sc.nextInt();
                if (a < 0) {
                    if (!inNegative) {
                        op++;
                        inNegative = true;
                    }
                }
                else if (a > 0) inNegative = false;
                sum += Math.abs(a);
            }
            output.append(sum).append(" ").append(op).append("\n");
        }
        System.out.print(output);
        sc.close();
    }
}
