package day_19;

class Solution {
    public String compressedString(String word) {
        word = word + " ";
        String comp = "";
        for (int i = 0; i < word.length() - 1; i++) {
            int count = 0;
            char key = word.charAt(i);
            while (word.charAt(i) == key && count < 9) {
                count++;
                i++;
            }
            comp = comp + count + key;
            i--;
        }
        return comp;
    }
}
