package Linked_List;
import java.util.HashMap;
// question find the length of loop in singly linkedList.

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
public class LoopLength {
    
    public int findLengthOfLoop(ListNode head) { //brute force - hashing

        HashMap<ListNode,Integer> visit = new HashMap<>();
        ListNode temp = head;
        int timer = 0;
        while(temp!=null){

        if(visit.containsKey(temp)){
            int loopLength= timer - visit.get(temp);
            return loopLength;
        }
        visit.put(temp,timer);
        temp=temp.next;
        timer++;
        }
        return 0;
    }
    
}
