package day_5;

import java.util.*;

public class BitPlusPlus {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String op;
        while (n > 0) {
            op = sc.next();
            if (op.equals("X++") || op.equals("++X")) x++;
            else x--;
            n--;
        }
        System.out.print(x);
        sc.close();
    }
}
