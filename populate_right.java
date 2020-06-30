//populate next right pointers
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null)
        return;
        Queue<TreeLinkNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.peek()!=null){
            int size=q.size()-1;
            while(size-->0){
                TreeLinkNode node=q.remove();
                node.next=q.peek();
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
            }
            q.remove();
            q.add(null);
        }
        
    }
}
