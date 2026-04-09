package Linked_List;
// add 1 to ll, recursive approach
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
public class Add1toll_recursion {
    private int helper(ListNode temp){
        if(temp==null) return 1;
        int carry = helper(temp.next);
        int sum = temp.val+ carry;
        if(sum < 10){
            temp.val=sum;
            return 0;
        }
        temp.val=0;
        return 1;
    }
    public ListNode addOne(ListNode head){
       int  carry = helper(head);
        if(carry == 1){
            ListNode newHead = new ListNode(1);
            newHead.next=head;
            return newHead;
        }
        return head;
    }
}
