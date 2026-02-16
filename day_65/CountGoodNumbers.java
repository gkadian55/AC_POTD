package day_65;

class Solution {
    public long pow(int x, long n) {
        if (n == 0) return 1;
        long half = pow(x, n/2);
        if (n % 2 == 0) return (half * half) % 1000000007;
        return (((half * half) % 1000000007) * x) % 1000000007;
    }
    public int countGoodNumbers(long n) {
        long ans = (pow(5, n - n/2) * pow(4, n/2)) % 1000000007;
        return (int) ans;
    }
}
