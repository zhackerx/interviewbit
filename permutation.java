//permutations
public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        helper(list,A,new ArrayList<Integer>());
        return list;
    }
    void helper(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> A,ArrayList<Integer> tmp){
        if(tmp.size()==A.size())
        list.add(new ArrayList<>(tmp));
        else{
            for(int i=0;i<A.size();i++){
                if(tmp.contains(A.get(i)))
                continue;
                tmp.add(A.get(i));
                helper(list,A,tmp);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
