package day_19;

class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder("");
        for (int i = 0; i < word.length(); ) {
            int count = 0;
            char key = word.charAt(i);
            while (i < word.length() && count < 9 && word.charAt(i) == key) {
                count++;
                i++;
            }
            comp.append(count).append(key);
        }
        return comp.toString();
    }
}
