//longest common subsequence
public class Solution {
    public int solve(String A, String B) {
        return helper(A.toCharArray(),B.toCharArray(),A.length(),B.length());
    }
    public int helper(char[] X,char[] Y,int m,int n){
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(X[i-1]==Y[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}