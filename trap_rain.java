//trap rainwater
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        if(A.size()==0||A==null)
        return 0;
        int n=A.size();
        int left[]=new int[n];
        int right[]=new int[n];
        int ans=0;
        left[0]=A.get(0);
        right[n-1]=A.get(n-1);
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],A.get(i));
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],A.get(i));
        }
        for(int i=0;i<n;i++){
            int area=Math.min(left[i],right[i]);
            ans+=area-A.get(i);
        }
        return ans;
    }
}
