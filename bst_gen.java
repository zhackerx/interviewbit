//generate from binary tree from inorder and postorder
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
     TreeNode genTree(List<Integer> in, List<Integer> post){
        if(in == null || in.size() ==0 ){
            return null;
        }
        TreeNode root = new TreeNode(post.get(post.size()-1));
        if(in.size() == 1)
            return root;
        
        int rootIndex = in.indexOf(root.val);
        List<Integer> leftIn = in.subList(0, rootIndex);
        List<Integer> leftPost = post.subList(0, rootIndex);
        List<Integer> rightIn = in.subList(rootIndex+1, in.size());
        List<Integer> rightPost = post.subList(rootIndex, in.size()-1);
        
        root.left = genTree(leftIn, leftPost);
        root.right = genTree(rightIn, rightPost);
        return root;
    }
    
    public TreeNode buildTree(ArrayList<Integer> in, ArrayList<Integer> post) {
        return genTree(in, post);
    }
}