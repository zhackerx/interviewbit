//recover bst
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
    ArrayList<Integer> ans=new ArrayList<>();
    TreeNode prev=null,first=null,second=null;
    public ArrayList<Integer> recoverTree(TreeNode a) {
        if(a==null)
        return ans;
        recover(a);
        ans.add(first.val);
        ans.add(second.val);
        Collections.sort(ans);
        return ans;
    }
    public void recover(TreeNode a){
        if(a==null)
        return;
        else{
            recover(a.left);
            if(prev==null){
                prev=a;
            }
            else{
                if(prev.val>a.val){
                    if(first==null){
                        first=prev;
                    }
                    second=a;
                }
                prev=a;
            }
            recover(a.right);
        }
    }
}
