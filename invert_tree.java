//invert the tree
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode A) {
        if(A==null)
        return null;
        swap(A);
        return A;
    }
    public void swap(TreeNode A){
        if(A.left==null&&A.right==null)return;
        TreeNode temp=A.left;
        A.left=A.right;
        A.right=temp;
        if(A.left!=null)swap(A.left);
        if(A.right!=null)swap(A.right);
    }
}
