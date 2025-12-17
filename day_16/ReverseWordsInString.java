package day_16;

import java.util.*;

public class ReverseWordsInString {
    public static void main() {
        String s = "the sky is blue";
        Stack<String> words = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String word = "";
            while (s.charAt(i) != ' ') {
                word += Character.toString(s.charAt(i));
                i++;
            }
            words.push(word);
        }
        System.out.println(words);
    }
}
