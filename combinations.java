//Combinations
public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(B>A)
        return list;
        helper(list,A,B,new ArrayList<>(),1);
        return list;
    }
    void helper(ArrayList<ArrayList<Integer>> list,int A,int B,ArrayList<Integer> tmp,int start){
        if(tmp.size()>B)
        return;
        if(tmp.size()==B&&!list.contains(tmp))
        list.add(new ArrayList<>(tmp));
        for(int i=start;i<=A;i++){
            tmp.add(i);
            helper(list,A,B,tmp,i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
