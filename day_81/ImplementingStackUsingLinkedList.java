package day_81;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class myStack {
    Node head;
    int size;

    public myStack() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void pop() {
        if (!isEmpty()) {
            head = head.next;
            size--;
        }
    }

    public int peek() {
        if (!isEmpty()) return head.data;
        return -1;
    }

    public int size() {
        return size;
    }
}

