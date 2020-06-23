//merge two linkedlist
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode start=new ListNode(0);
        ListNode tmp=start;
        while(A!=null&&B!=null){
            if(A.val<B.val){
                tmp.next=new ListNode(A.val);
                A=A.next;
            }
            else
            {
                tmp.next=new ListNode(B.val);
                B=B.next;
            }
            tmp=tmp.next;
        }
        while(A!=null){
            tmp.next=new ListNode(A.val);
            A=A.next;
            tmp=tmp.next;
        }
        while(B!=null){
            tmp.next=new ListNode(B.val);
            B=B.next;
            tmp=tmp.next;
        }
        return start.next;
    }
}
