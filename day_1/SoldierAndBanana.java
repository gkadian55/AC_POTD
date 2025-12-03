package day_1;

import java.util.*;

public class SoldierAndBanana {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int w = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k*i;
        }
        int borrow = sum - n;
        if (borrow < 0) borrow = 0;
        System.out.print(borrow);
        scan.close();
    }
}
