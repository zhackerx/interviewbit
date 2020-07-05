//interleaving string
//using char from A and B string to form String c sequentially
int getlcs(string A,string B)
{
int m=A.length();
int n=B.length();
int dp[m+1][n+1];
int i,j;
for(i=0;i<=m;i++)
{
for(j=0;j<=n;j++)
{
if(i==0 || j==0)
dp[i][j]=0;
}
}
for(i=1;i<=m;i++)
{
for(j=1;j<=n;j++)
{
if(A[i-1]==B[j-1])
dp[i][j]=dp[i-1][j-1]+1;
else
dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
}
}
return dp[m][n];
}
int Solution::isInterleave(string A, string B, string C) {
int m=A.length();
int n=B.length();
int k=C.length();
int i,j;
int l1=getlcs(A,C);
int l2=getlcs(B,C);
if(l1==m && l2==n)
return 1;
else
return 0;
}