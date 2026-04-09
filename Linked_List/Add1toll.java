package Linked_List;
// add 1 to ll, ex- 1->5->9 add 1 1->6->0
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
public class Add1toll {
    //brute
    public ListNode reverse(ListNode head){
        ListNode temp =head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode addOne(ListNode head) {
        head = reverse(head);
        ListNode temp =head;
        int carry=1;
        while(temp!=null){
            temp.val=temp.val + carry;
            if(temp.val<10){
                carry=0;
                break;
            }else{
                temp.val = 0;
                carry=1;
            }
            temp=temp.next;
        }
        if(carry == 1){
            head = reverse(head);
            ListNode newHead = new ListNode(1);
            newHead.next=head;
            return newHead;
        }else{
            head=reverse(head);
            return head;
        }
    }
}