//Subset containing only unique elements
public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        helper(list,A,new ArrayList<>(),0);
        return list;
    }
    void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> A,ArrayList<Integer> tmp,int i){
        list.add(tmp);
        if(i==A.size())
        return;
        for(int j=i;j<A.size();j++){
            ArrayList<Integer> tmp1=new ArrayList<>(tmp);
            tmp1.add(A.get(j));
            helper(list,A,tmp1,j+1);
        }
    }
}




