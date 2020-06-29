//combination sum
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(A.size()==0)
        return list;
        Collections.sort(A);
        helper(list,A,new ArrayList<>(),B,0);
        return list;
    }
    void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> A,ArrayList<Integer> tmp,int B,int start){
        if(B<0)
        return;
        if(B==0){
            if(!list.contains(tmp))
        list.add(new ArrayList<>(tmp));}
        for(int i=start;i<A.size();i++){
            tmp.add(A.get(i));
            helper(list,A,tmp,B-A.get(i),i);
            tmp.remove(tmp.size()-1);
        }
    }
}
