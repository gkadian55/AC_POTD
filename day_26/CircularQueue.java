package day_26;

class MyCircularQueue {
    int[] circularQueue;
    int front;
    int rear;
    int size;
    int count;

    public MyCircularQueue(int k) {
        circularQueue = new int[k];
        front = 0;
        rear = -1;
        size = k;
        count = 0;
    }
    
    public boolean enQueue(int value) {
        if (!isFull()) {
            rear = (rear + 1) % size;
            circularQueue[rear] = value;
            count++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if (!isEmpty()) {
            front = (front + 1) % size;
            count--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if (!isEmpty()) return circularQueue[front];
        return -1;
    }
    
    public int Rear() {
        if (!isEmpty()) return circularQueue[rear];
        return -1;
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == size;
    }
}
