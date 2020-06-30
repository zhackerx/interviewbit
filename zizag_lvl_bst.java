//zig zag levl order bst
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
    Map<Integer,ArrayList<Integer>> map=new HashMap<>();
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        int h=height(A);
        for(int i=1;i<=h;i++){
            pmap(A,i,1);
        }
        for(int i=1;i<=h;i++){
            ArrayList<Integer> tmp=map.get(i);
            if(i%2==0)
            Collections.reverse(tmp);
            list.add(tmp);
        }
        return list;
    }
    public int height(TreeNode A){
        if(A==null)
        return 0;
        return 1+Math.max(height(A.left),height(A.right));
    }
    public void pmap(TreeNode A,int level,int actual){
        if(A==null)
        return;
        if(level==1){
            ArrayList<Integer> ans;
            if(!map.containsKey(actual)){
                ans=new ArrayList<>();
            }
            else{
                ans=map.get(actual);
            }
            ans.add(A.val);
            map.put(actual,ans);
        }
        else{
            pmap(A.left,level-1,actual+1);
            pmap(A.right,level-1,actual+1);
        }
    }
}