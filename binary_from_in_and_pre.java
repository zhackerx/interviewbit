//binary tree from inorder and preorder
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
    int end=0;
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A==null)
        return null;
        end=0;
        return helper(B,A,0,B.size()-1);
    }
    public TreeNode helper(ArrayList<Integer> in,ArrayList<Integer> pre,int is,int ie){
        if(is>ie)return null;
        if(end==pre.size())return null;
        TreeNode root=new TreeNode(pre.get(end++));
        if(is==ie)return root;
        int id=find(in,is,ie,root.val);
        root.left=helper(in,pre,is,id-1);
        root.right=helper(in,pre,id+1,ie);
        return root;
    }
    public int find(ArrayList<Integer> in,int s,int e,int num){
        for(int i=s;i<=e;i++)
        if(in.get(i)==num)
        return i;
        return -1;
    }
}
