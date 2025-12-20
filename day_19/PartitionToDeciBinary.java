package day_19;

class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = (int) (n.charAt(i) - '0');
            if (digit > maxDigit) maxDigit = digit;
            if (maxDigit == 9) break;
        }
        return maxDigit;
    }
}
