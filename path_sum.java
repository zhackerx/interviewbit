//path sum
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
    public int hasPathSum(TreeNode A, int B) {
        if(hasPathSum1(A,B))
        return 1;
        else
        return 0;
    }
    public boolean hasPathSum1(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.left==null&&root.right==null&&sum-root.val==0)return true;
        return hasPathSum1(root.left,sum-root.val)||hasPathSum1(root.right,sum-root.val);
    }
}
