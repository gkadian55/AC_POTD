package day_14;

import java.util.*;

public class AddModulo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");

        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a % 10 == 0 || a % 10 == 5) { //fixed elements
                    array[i] = a + (a % 10);
                }
                else {
                    while (a % 10 != 2) { //normalizing cyclic elements
                        a += (a % 10);
                    }
                    array[i] = a % 20;
                }
            }

            boolean oneZero = false, oneRest = false;
            for (int a : array) {
                if (a % 10 == 0) oneZero = true;
                else oneRest = true;
            }

            boolean holds = true;

            if (oneZero && oneRest) {
                holds = false;
            } 
            else if (oneRest) {
                int key = array[0];
                for (int i = 1; i < n; i++) {
                    if (array[i] != key) {
                        holds = false;
                        break;
                    }
                }
            } 
            else {
                int key = array[0];
                for (int i = 1; i < n; i++) {
                    if (array[i] != key) {
                        holds = false;
                        break;
                    }
                }
            }
            if (holds) sb.append("YES\n");
            else sb.append("NO\n");
            t--;
        }
        System.out.println(sb);
        sc.close();
    }
}
