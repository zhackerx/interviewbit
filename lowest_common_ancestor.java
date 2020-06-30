//lowest common ancestor
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
    public int lca(TreeNode A, int B, int C) {
       if(!does(A,B)||!does(A,C))
       return -1;
       TreeNode ans=lcaimp(A,B,C);
       return ans==null?-1:ans.val;
    }
    public TreeNode lcaimp(TreeNode A,int B,int C){
        if(A==null)
        return null;
        if(A.val==B||A.val==C)
        return A;
        TreeNode l=lcaimp(A.left,B,C);
        TreeNode r=lcaimp(A.right,B,C);
        if(l!=null&&r!=null){
            return A;
        }
        return l!=null?l:r;
    }
    public boolean does(TreeNode A,int B){
        if(A==null)
        return false;
        if(A.val==B)
        return true;
        return does(A.left,B)||does(A.right,B);
    }
}
