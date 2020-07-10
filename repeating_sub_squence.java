//repeating sub sequence
public class Solution {
    public int anytwo(String A) {
        int dp[][]=new int[A.length()+1][A.length()+1];
        for(int i=1;i<A.length()+1;i++){
            for(int j=i+1;j<A.length()+1;j++){
                if(A.charAt(i-1)==A.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int i=0;i<A.length()+1;i++){
            for(int j=0;j<A.length()+1;j++){
                if(dp[i][j]>1)
                return 1;
            }
        }
        return 0;
    }
}