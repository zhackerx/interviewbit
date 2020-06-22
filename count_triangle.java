//count triangles
public class Solution {
    public int nTriang(ArrayList<Integer> A) {
        int mod=1000000007;
        int n=A.size();
        if(n<3)
        return 0;
        Collections.sort(A);
        int res=0;
        for(int i=n-1;i>=0;i--){
            int j=0;
            int k=i-1;
            while(j<k){
                long sum=A.get(j)+A.get(k);
                if(sum>A.get(i)){
                  res=(res+(k-j)%mod)%mod;  
                  k--;
                }
                else
                j++;
            }
        }
        return res;
    }
}
