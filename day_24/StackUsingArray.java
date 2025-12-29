package day_24;

class myStack {
    int[] stack;
    int top;
    int size;

    public myStack(int n) {
       stack = new int[n];
       top = -1;
       size = n;
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    public boolean isFull() {
        if (top == size - 1) return true;
        return false;
    }

    public void push(int x) {
        if (top != size - 1) {
            top++;
            stack[top] = x;
        }
    }

    public void pop() {
        if (top != -1) {
            top--;
        }
    }

    public int peek() {
        if (top != -1) return stack[top];
        return -1;
    }
}
