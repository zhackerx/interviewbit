//Max profit by buy and sell
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        int p=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1])
            p+=A[i+1]-A[i];
        }
        return p;
    }
}
