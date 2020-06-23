//partition list nodes less than x before more or equal nodes
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode n1=new ListNode(0);
        ListNode n2=new ListNode(0);
        ListNode cur1=n1;
        ListNode cur2=n2;
        while(A!=null){
            if(A.val<B){
                cur1.next=new ListNode(A.val);
                cur1=cur1.next;
            }
            else{
                cur2.next=new ListNode(A.val);
                cur2=cur2.next;
            }
            A=A.next;
        }
        cur1.next=n2.next;
        return n1.next;
    }
}
