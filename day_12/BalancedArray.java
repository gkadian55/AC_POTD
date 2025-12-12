package day_12;

import java.util.*;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        int t = sc.nextInt();
        while (t > 0){
            int n = sc.nextInt();
            if (n % 4 == 0) {
                int i = 2, j = 1;
                int sumOdd = 0, sumEven = 0;
                Stack<Integer> array = new Stack<>();
                for (int k = 0; k < n - 1; k++) {
                    if (k < n/2) {
                        array.push(i);
                        sumEven += i;
                        i = i + 2;
                    }
                    else if (k < n - 1) {
                        array.push(j);
                        sumOdd += j;
                        j = j + 2;
                    }
                }
                array.push(sumEven - sumOdd);
                sb.append("YES").append("\n");
                for (int a : array) sb.append(a + " ");
                sb.append("\n");
            }
            else sb.append("NO").append("\n");
            t--;
        }
        System.out.print(sb);
        sc.close();
    }
}
