//k merge sorted
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
	    return part(a,0,a.size()-1);
	}
	public ListNode part(ArrayList<ListNode> a,int start,int end){
	    if(start==end)return a.get(start);
	    if(start<end){
	        int mid=(start+end)/2;
	        ListNode l1=part(a,start,mid);
	        ListNode l2=part(a,mid+1,end);
	        return merge(l1,l2);
	    }
	    else
	    return null;
	}
	public static ListNode merge(ListNode l1,ListNode l2){
	    if(l1==null)return l2;
	    if(l2==null)return l1;
	    if(l1.val<l2.val){
	        l1.next=merge(l1.next,l2);
	        return l1;
	    }
	    else
	    {
	        l2.next=merge(l1,l2.next);
	        return l2;
	    }
	}
}
