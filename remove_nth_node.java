//remove nth node
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int len=getLength(A);
        int stop=len-B;
        if(stop<=0){
            ListNode head=A.next;
            A=null;
            return head;
        }
        int count=1;
        ListNode curr=A;
        while(count!=stop){
            curr=curr.next;
            count++;
        }
        curr.next=curr.next.next;
        return A;
    }
    public int getLength(ListNode a){
        int l=0;
        while(a!=null){
            l++;
            a=a.next;
        }
        return l;
    }
}
