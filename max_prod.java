//Max product
public class Solution {
    public int maxp3(ArrayList<Integer> A) {
        if(A==null||A.size()<3)
        return 0;
        int max;
        A.sort(Collections.reverseOrder());
        int len = A.size();
        return Math.max(A.get(0)*A.get(1)* A.get(2), A.get(0)*A.get(len-1)*A.get(len-2));
    }
}
