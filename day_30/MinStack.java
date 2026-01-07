package day_30;

import java.util.*;

class Pair {
    int value;
    int minimum;
    Pair(int value, int minimum) {
        this.value = value;
        this.minimum = minimum;
    }
}

class MinStack {
    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) stack.push(new Pair(val, val));
        else {
            int min = getMin();
            if (val < min) min = val;
            stack.push(new Pair(val, min));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().minimum;
    }
}
