//longest pallindromic subsequence
public class Solution {
    public int solve(String s) {
        char c[]=s.toCharArray();
        char a[]=new char[s.length()];
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            a[i]=c[k++];
        }
        int dp[][]=new int[s.length()+1][s.length()+1];
        for(int i=0;i<s.length()+1;i++){
            for(int j=0;j<s.length()+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(a[i-1]==c[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s.length()][s.length()];
    }
}