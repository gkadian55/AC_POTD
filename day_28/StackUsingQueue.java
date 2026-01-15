package day_28;

import java.util.*;

class myStack {
    Queue<Integer> q = new ArrayDeque<>();
    Queue<Integer> storage = new ArrayDeque<>();

    void push(int x) {
        q.add(x);
    }

    void pop() {
        if (!q.isEmpty()) {
            while (q.size() > 1) storage.add(q.poll());
            q.poll();
            while (!storage.isEmpty()) q.add(storage.poll());
        }
    }

    int top() {
        int ans = -1;
        if (!q.isEmpty()) {
            while (q.size() > 1) storage.add(q.poll());
            ans = q.peek();
            storage.add(q.poll());
            while (!storage.isEmpty()) q.add(storage.poll());
        }
        return ans;
    }

    int size() {
        return q.size();
    }
}

