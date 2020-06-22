//single number when many duplicates are present in the list
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int ones=0;
        int two=0;
        for(int i=0;i<A.size();i++){
            ones=(ones^A.get(i))&(~two);
            two=(two^A.get(i))&(~ones);
        }
        return ones;
    }
}
