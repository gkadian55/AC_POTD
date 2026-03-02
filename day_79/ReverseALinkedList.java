package day_79;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    Node reverseList(Node head) {
        Node slow = head;
        Node curr = slow.next;
        while (curr != null) {
            Node fast = curr.next;
            curr.next = slow;
            slow = curr;
            curr = fast;
        }
        head.next = null;
        head = slow;
        return head;
    }
}
