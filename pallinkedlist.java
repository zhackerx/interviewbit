//pallindrome in linkedlist 
//find the mid point and reverse the list and check if they are equal
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        if(A==null||A.next==null)return 1;
        int l = 0;
        ListNode curr = A;
        while (curr != null){
            l++;
            curr = curr.next;
        }
        int i = 1;
        curr = A;
        while (i < l/2){
            curr = curr.next;
            i++;
        }
        ListNode rev=reverse(curr.next);
        ListNode mid=A;
        while(rev!=null){
            if(rev.val!=mid.val)return 0;
            mid=mid.next;
            rev=rev.next;
        }
        return 1;
    }
    ListNode reverse(ListNode a){
        ListNode prev=null,curr=a,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
