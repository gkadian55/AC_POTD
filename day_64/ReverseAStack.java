package day_64;

import java.util.*;

class Solution {
    public static void remove(Queue<Integer> storage, Stack<Integer> st) {
        if (st.isEmpty()) return;
        storage.add(st.pop());
        remove(storage, st);
    }
    public static void add(Queue<Integer> storage, Stack<Integer> st) {
        if (storage.isEmpty()) return;
        st.push(storage.poll());
        add(storage, st);
    }
    public static void reverseStack(Stack<Integer> st) {
        Queue<Integer> storage = new ArrayDeque<>();
        remove(storage, st);
        add(storage, st);
    }
}
