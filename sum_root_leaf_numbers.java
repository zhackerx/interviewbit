//sum root to leaf numbers
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
    public int sumNumbers(TreeNode A) {
        return sum(A,0)%1003;
    }
    public int sum(TreeNode root,int index){
        if(root==null)
        return 0;
        if(root.left==null&&root.right==null){
            return (index*10+root.val)%1003;
        }
        int n=index*10+root.val;
        n%=1003;
        int ans=(sum(root.left,n)+sum(root.right,n));
        return ans%1003;
    }
}
