//reorder list l0 ln l1 ln-1 l2 ln-2..... so on
public class Solution {
    public ListNode reorderList(ListNode head) {
	if(head==null||head.next==null)
		return head;
		ListNode prev=null,slow=head,curr=head,fast=head,l1=head;
		while(fast!=null&&fast.next!=null){
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		prev.next=null;
		ListNode l2=reverse(slow);
		merge(l1,l2);
		return l1;
	}
	ListNode reverse(ListNode head){
		ListNode prev=null;
		ListNode curr=head;
		ListNode next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	void merge(ListNode head1,ListNode head2){
		while(head2!=null){
			ListNode next=head1.next;
			head1.next=head2;
			head1=head2;
			head2=next;
		}
	}
}