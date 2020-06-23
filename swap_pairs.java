//swap nodes in pair 
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A==null||A.next==null)
        return A;
        ListNode prev=null,next=null;
        ListNode curr=A;
        int count=0;
        while(count<2&&curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
        A.next=swapPairs(next);
        return prev;
    }
}
