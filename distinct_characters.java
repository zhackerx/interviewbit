//distinct characters
public class Solution {
    public int numDistinct(String s1, String s2) {
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
        dp[i][0]=1;
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(c1[i-1]!=c2[j-1]){
                    dp[i][j]=dp[i-1][j];
                }
                else
                dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
            }
        }
        return dp[m][n];
    }
}