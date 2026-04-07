package Linked_List;

import java.util.LinkedList; 

class Node{
    int data;
    Node next;
    public Node(int data ,Node next){
        this.data = data;
        this.next = next;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Create {
    public static void main(String args[]){
        int []arr = {2,4,6,8};
        Node head = new Node(arr[0]);
        System.out.println(head.data);
        Node temp = head;
        Node prev = temp;
        int i=1;
        while(i<arr.length-2){
            prev = temp;
            temp = temp.next;
            temp.data = arr[i];
        }
        System.out.println(prev.data);
    }
}
