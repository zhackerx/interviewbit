//Longest common subsequence
public class Solution {
    public int solve(String A, String B) {
        return helper(A.toCharArray(),B.toCharArray(),A.length(),B.length());
    }
    public int helper(char[] X,char[] Y,int m,int n){
        int memo[][] = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					memo[i][j] = 0;
				else if (X[i - 1] == Y[j - 1])
					memo[i][j] = memo[i - 1][j - 1] + 1;
				else
					memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
			}
		}
		return memo[m][n];
    }
}
