package day_5;

public class SymmetricIntegers {
    class Solution {
        public int countSymmetricIntegers(int low, int high) {
            int n, n1, n2, n3, n4, sum1, sum2, count = 0;
            for (int i = low; i <= high; i++){
                if (i < 100) {
                    if (i % 11 == 0) count++;
                }
                else if (i > 1000){
                    n = i;
                    n1 = n % 10;
                    n = n / 10;
                    n2 = n % 10;
                    n = n / 10;
                    n3 = n % 10;
                    n4 = n / 10;
                    sum1 = n1 + n2;
                    sum2 = n3 + n4;
                    if (sum1 == sum2) count++;
                }
            }
            return count;
        }
    }
}
