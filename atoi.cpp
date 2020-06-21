//Atoi problem using c++
int Solution::atoi(const string A) {
    stringstream ss(A);
    int n=0;
    ss>>n;
    return n;
}
