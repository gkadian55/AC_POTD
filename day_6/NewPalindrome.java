package day_6;

import java.util.*;

public class NewPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int len, flag;
        String str;
        char key, check;
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            str = sc.nextLine();
            len = str.length();
            if (len < 4) {
                result[i] = "NO";
            }
            else {
                flag = 0;
                key = str.charAt(0);
                for (int j = 1; j < len/2; j++){
                    check = str.charAt(j);
                    if (check != key){
                        result[i] = "YES";
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) result[i] = "NO";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}
