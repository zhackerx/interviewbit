//reverse between B and C
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    ListNode reverse(ListNode head,int b)
    {   
        
        ListNode prev = null;
        ListNode curr = head,next;
        int n = 1;
        while(n<=b&&curr!=null)
        {
            next = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = next;
            n++;
        }
        head.next = curr;
        return prev;
    }
    public ListNode reverseBetween(ListNode A, int a, int b) {
        ListNode tmp = null,head =A;
        if(A==null || A.next == null)return A;
        int n = 1;
        while(n<a)
        {   
            tmp = A;
            A = A.next;
            n++;
        }
        ListNode prev = reverse(A,b-a+1);
        if(tmp==null)return prev;
        
        tmp.next = prev;
        return head;
    }
}
