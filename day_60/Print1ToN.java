package day_60;

class Solution {
    static void printTillN(int N) {
        if (N > 0) {
            printTillN(N-1);
            System.out.print(N + " ");
        }
    }
}
