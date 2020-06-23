//reverse count=given nodes number 
//use recursive approach
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode prev=null,next=null;
        ListNode curr=A;
        int count=0;
        while(count<B&&curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
        A.next=reverseList(next,B);
        return prev;
    }
}
