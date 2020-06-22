//minimum absolute difference
public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int diff=Integer.MAX_VALUE;
        int p=A.size(),q=B.size(),r=C.size(),i=0,j=0,k=0;
        while(i<p&&j<q&&k<r){
            int minimum=Math.min(Math.min(A.get(i),B.get(j)),C.get(k));
            int maximum=Math.max(Math.max(A.get(i),B.get(j)),C.get(k));
            int diff1=maximum-minimum;
            if(diff1<diff){
                diff=diff1;
            }
            if(diff==0)break;
            if(A.get(i)==minimum)i++;
            else if(B.get(j)==minimum)j++;
            else
            k++;
        }
        return diff;
    }
}
