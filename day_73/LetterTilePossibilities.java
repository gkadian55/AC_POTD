package day_73;

import java.util.*;

class Solution {
    int count = 0;
    public void generate(char[] letters, boolean[] marked) {
        for (int i = 0; i < letters.length; i++) {
            if (!marked[i]) {
                if (i > 0 && letters[i] == letters[i - 1] && !marked[i - 1]) continue;
                marked[i] = true;
                count++;
                generate(letters, marked);
                marked[i] = false;
            }
        }
    }
    public int numTilePossibilities(String tiles) {
        char[] letters = new char[tiles.length()];
        for (int i = 0; i < tiles.length(); i++) letters[i] = tiles.charAt(i);
        Arrays.sort(letters);
        boolean[] marked = new boolean[letters.length];
        generate(letters, marked);
        return count;
    }
}
