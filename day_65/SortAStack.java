package day_65;

import java.util.*;

class Solution {
    public static void remove(List<Integer> storage, Stack<Integer> st) {
        if (st.isEmpty()) return;
        storage.add(st.pop());
        remove(storage, st);
    }
    public static void add(List<Integer> storage, Stack<Integer> st, int n) {
        if (n < 0) return;
        add(storage, st, n-1);
        st.push(storage.get(n));
    }
    public static void sortStack(Stack<Integer> st) {
        List<Integer> storage = new ArrayList<>();
        remove(storage, st);
        int n = storage.size();
        Collections.sort(storage);
        add(storage, st, n-1);
    }
}
