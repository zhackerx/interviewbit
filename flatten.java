//flatten binary tree
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    TreeNode prev=null;
    public TreeNode flatten(TreeNode a) {
        if(a==null)
        return null;
        helper(a);
        return a;
    }
    void helper(TreeNode root){
        if(root==null)
        return;
        helper(root.right);
        helper(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
}
