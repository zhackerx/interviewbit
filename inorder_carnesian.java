//Construct inorder carnesian tree
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
    public TreeNode buildTree(ArrayList<Integer> A) {
        if(A==null)
        return null;
        return helper(A,0,A.size()-1);
    }
    public TreeNode helper(ArrayList<Integer> A,int is,int ie){
        if(A==null)
        return null;
        if(is>ie)
        return null;
        int id=find(A,is,ie);
        TreeNode root=new TreeNode(A.get(id));
        root.left=helper(A,is,id-1);
        root.right=helper(A,id+1,ie);
        return root;
    }
    public int find(ArrayList<Integer> A,int start,int end){
        int max=Integer.MIN_VALUE;
        int id=-1;
        for(int i=start;i<=end;i++){
            if(A.get(i)>max){
                max=A.get(i);
                id=i;
            }
        }
        return id;
    }
}
