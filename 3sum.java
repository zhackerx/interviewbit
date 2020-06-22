//3 sum to get closet to target value
public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        int min=Integer.MAX_VALUE,res=0;
        Collections.sort(A);
        for(int i=0;i<A.size()-2;i++){
            int j=i+1;
            int k=A.size()-1;
            while(j<k){
                int sum=A.get(i)+A.get(j)+A.get(k);
                int diff=Math.abs(sum-B);
                if(diff==0)
                return B;
                if(min>diff){
                    min=diff;
                    res=sum;
                }
                if(sum<=B)
                j++;
                else
                k--;
            }
        }
        return res;
    }
}
