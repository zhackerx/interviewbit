//subsets containing duplicates
public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        if(A.size()==0)
        return list;
        Collections.sort(A);
        helper(list,A,new ArrayList<>(),0);
        return list;
    }
    void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> A,ArrayList<Integer> tmp,int start){
        for(int i=start;i<A.size();i++){
            tmp.add(A.get(i));
            if(!list.contains(tmp))
            list.add(new ArrayList<>(tmp));
            helper(list,A,tmp,i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
