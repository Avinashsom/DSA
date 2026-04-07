package Linked_List;

//reverse a doubly linked list;

class Node {
    int data;
    Node prev, next;
    Node(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}

public class ReverseDLL {

    public Node reverseDLL(Node head) {
        if(head == null || head.next == null) return head;
        Node prev = null;
        Node front = null;
        Node temp = head;
        while(temp != null){
            front= temp.next;
            temp.next = prev;
            temp.prev = front;
            prev =temp;
            temp =front;
        }
        return prev;
    }
}
