//assign mice to holes
public class Solution {
    public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size()!=B.size())
        return 0;
        Collections.sort(A);
        Collections.sort(B);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            ans.add(Math.abs(B.get(i)-A.get(i)));
        }
        Collections.sort(ans);
        return ans.get(ans.size()-1);
    }
}
