//Combinations sum 2
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int b) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(A.size()==0)
        return list;
        Collections.sort(A);
        helper(list,new ArrayList<Integer>(),A,b,0);
        return list;
    }
    void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> tmp,ArrayList<Integer> A,int b,int start){
        if(b<0)
        return;
        if(b==0)
        {
            if(!list.contains(tmp))
            list.add(new ArrayList<>(tmp));
        }
        for(int i=start;i<A.size();i++){
            tmp.add(A.get(i));
            helper(list,tmp,A,b-A.get(i),i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
