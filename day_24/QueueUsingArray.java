package day_24;

class myQueue {
    int[] queue;
    int size;
    int front;
    int rear;
    int count;
    
    public myQueue(int n) {
        queue = new int[n];
        size = n;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        if (count == 0) return true;
        return false;
    }

    public boolean isFull() {
        if (size == count) return true;
        return false;
    }

    public void enqueue(int x) {
        if (!isFull()) {
            rear = (rear + 1) % size;
            queue[rear] = x;
            count++;
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            front = (front + 1) % size;
            count--;
        }
    }

    public int getFront() {
        if (!isEmpty()) return queue[front];
        return -1;
    }

    public int getRear() {
        if (!isEmpty()) return queue[rear];
        return -1;
    }
}

