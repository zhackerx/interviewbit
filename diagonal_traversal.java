//diagonal traversal
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
    HashMap<Integer, ArrayList<Integer>> map;
    public ArrayList<Integer> solve(TreeNode root) {
        map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        diagonalSolve(root, 0);
        
        for(Map.Entry<Integer, ArrayList<Integer>> me: map.entrySet())
            ans.addAll(me.getValue());
            
        return ans;
    }
    
    void diagonalSolve(TreeNode root, int d)
    {
        if(root == null)
            return;
            
        map.putIfAbsent(d, new ArrayList<>());
        map.get(d).add(root.val);
        
        diagonalSolve(root.left, d + 1);
        diagonalSolve(root.right, d);
    }
    
}
