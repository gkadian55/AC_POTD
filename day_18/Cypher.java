package day_18;

import java.util.*;

public class Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] wheel = new int[n];
            for (int i = 0; i < n; i++) wheel[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int movesNum = sc.nextInt();
                String moves = sc.nextLine();
                for (int b = 1; b <= movesNum; b++) {
                    if (moves.charAt(b) == 'U') {
                        if (wheel[i] == 0) wheel[i] = 9;
                        else wheel[i]--;
                    }
                    else {
                        if (wheel[i] == 9) wheel[i] = 0;
                        else wheel[i]++;
                    }
                }
            }
            for (int a : wheel) sb.append(a).append(" ");
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
