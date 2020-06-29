//symmetric trees
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
    public int isSymmetric(TreeNode A) {
        if(A==null)
        return 1;
        return assym(A.left,A.right)==true?1:0;
    }
    public boolean assym(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null)
        return true;
        if(root1==null&&root2!=null)
        return false;
        if(root2==null&&root1!=null)
        return false;
        if(root1.val!=root2.val)return false;
        return assym(root1.left,root2.right)&&assym(root1.right,root2.left);
    }
}
