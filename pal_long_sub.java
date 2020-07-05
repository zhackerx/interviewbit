//pallindromic subsequence longest
public class Solution {
    public int solve(String s) {
        int m = s.length();
        char str[]=s.toCharArray();
        char A[]=new char[m];int k=0;
        for(int i=m-1;i>=0;i--)
        A[k++]=str[i];
int o = A.length;

int LCS[][]=new int[m+1][o+1];
for(int i =0; i<=m; i++){

    for(int j =0; j<=o; j++){
        
        if(i==0 || j==0){
            
            LCS[i][j] =0;
        }
     
     else if(str[i-1]== A[j-1]){
         
         
         LCS[i][j] = LCS[i-1][j-1]+1;
        
        
    }
    
    else 
    LCS[i][j] = Math.max(LCS[i][j-1],LCS[i-1][j]);
    
}

}
return LCS[m][o];
    }
	}