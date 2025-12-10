package day_10;

class Solution {
    public String addStrings(String num1, String num2) {  
        StringBuilder sum = new StringBuilder("");
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        while (p1 >= 0 || p2 >= 0 || carry == 1) {
            int n1 = (p1 < 0) ? 0 : num1.charAt(p1) - '0';
            int n2 = (p2 < 0) ? 0 : num2.charAt(p2) - '0';
            int digit = n1 + n2 + carry;
            carry = digit / 10;
            digit %= 10;
            sum.append(digit);
            p1--;
            p2--;
        }
        return sum.reverse().toString();
    }
}