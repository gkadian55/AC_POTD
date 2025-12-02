package day_3;

import java.util.*;
import java.lang.Math;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long rows = (long) Math.ceil(n / (double) a);
        long cols = (long) Math.ceil(m / (double) a);
        long stones = rows * cols;
        System.out.print(stones);
        sc.close();
    }
}
