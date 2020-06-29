//inorder traversal
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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> list=new ArrayList<>();
        if(A==null)
        return list;
        inorder(list,A);
        return list;
    }
    public void inorder(ArrayList<Integer> list,TreeNode root){
        if(root==null)
        return;
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
}
