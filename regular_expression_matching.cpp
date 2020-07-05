//regular expression matching
int Solution::isMatch(const string A, const string B) {
    int i=A.size()-1;
int j=B.size()-1;
while(i>=0 && j>=0){
if(B[j]=='*'){
j--;
while(A[i]==B[j] || B[j]=='.'){
i--;
if(i<0)return 1;
}
j--;
if(j<0)return 0;
}
if(A[i]==B[j] || B[j]=='.'){
i--;
j--;
}
else return 0;
}
if(i>=0 && j<0)return 0;
if(i<0 && j>=0)return 0;
return 1;
}
