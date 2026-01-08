package day_31;

import java.util.*;

class MyQueue {
    Stack<Integer> queue;
    Stack<Integer> storage;

    public MyQueue() {
        queue = new Stack<>();
        storage = new Stack<>();
    }
    
    public void push(int x) {
        queue.push(x);
    }
    
    public int pop() {
        while (queue.size() != 1) storage.push(queue.pop());
        int ans = queue.pop();
        while (!storage.isEmpty()) queue.push(storage.pop());
        return ans;
    }
    
    public int peek() {
        while (queue.size() != 1) storage.push(queue.pop());
        int ans = queue.peek();
        while (!storage.isEmpty()) queue.push(storage.pop());
        return ans;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
