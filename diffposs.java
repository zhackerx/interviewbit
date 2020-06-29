//diffII
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        if(A==null||A.size()<=1)
        return 0;
        Set<Integer> set=new HashSet<Integer>();
        for(int i:A){
            if(set.contains(i+B)||set.contains(i-B))
            return 1;
            set.add(i);
        }
        return 0;
    }
}
