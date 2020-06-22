//minimum characters to make string pallindrome
vector<int> lpsArray(string S)
{
    int n=S.length();
    vector<int> lps(n);
    
    int len=0;
    lps[0]=0;
    
    int i=1;
    while(i<n)
    {
        if(S[i]==S[len])
        {
            len++;
            lps[i]=len;
            i++;
        }
        else
        {
            if(len!=0)
            {
                len=lps[len-1];
            }
            else
            {
                lps[i]=0;
                i++;
            }
        }
    }
    
    return lps;
}

int Solution::solve(string A) {
    
    string revA=A;
    reverse(revA.begin(),revA.end());
    
    string S = A+"$"+revA;
    vector<int> lps = lpsArray(S);
    
    return (A.length()-lps.back());
}