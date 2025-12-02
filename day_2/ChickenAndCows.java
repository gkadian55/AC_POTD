package day_2;

import java.util.*;

public class ChickenAndCows {
    public static void main(String[] args) {
        int legs, count;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m;
        int[] counter = new int[n];
        for (int i = 0; i < n; i++){
            count = 0;
            legs = sc.nextInt();
            for (int cows = 0; cows <= legs/4; cows++){
                for (int chickens = 0; chickens <= legs/2; chickens++){
                    if (4*cows + 2*chickens == legs) count++;
                }
            }
            counter[i] = count;
        }
        for (int i = 0; i < counter.length; i++){
            System.out.println(counter[i]);
        }
        sc.close();
    }
}
