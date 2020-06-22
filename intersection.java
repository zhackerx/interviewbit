//intersection of two list
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        int i=0,j=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        while(i<A.size()&&j<B.size()){
            if(A.get(i).equals(B.get(j))){
                ans.add(A.get(i));
                i++;
                j++;
            }
            else if(A.get(i)>B.get(j)){
                j++;
            }
            else
            i++;
        }
        return ans;
    }
}
