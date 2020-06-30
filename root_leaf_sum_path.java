//root leaves path sum
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
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        if(A==null)
        return list;
        Stack<Integer> stack=new Stack<>();
        helper(A,B,stack);
        return list;
    }
    public void helper(TreeNode A,int B,Stack<Integer> stack){
        stack.push(A.val);
        if(A.left==null&&A.right==null)
        {
            if(B==A.val){
                list.add(new ArrayList<>(stack));
            }
        }
        if(A.left!=null)helper(A.left,B-A.val,stack);
        if(A.right!=null)helper(A.right,B-A.val,stack);
        stack.pop();
    }
}
