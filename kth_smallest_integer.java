//kth smallest 
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
    public int kthsmallest(TreeNode A, int B) {
        Stack<TreeNode> stack=new Stack<>();
        while(A!=null){
            stack.push(A);
            A=A.left;
        }
        while(B>0){
            TreeNode root=stack.pop();
            B--;
            if(B==0) return root.val;
            TreeNode right=root.right;
            while(right!=null){
                stack.push(right);
                right=right.left;
            }
        }
        return -1;
    }
}
