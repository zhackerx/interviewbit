//find maximum area of water in container
public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        if(A.size()<=1)
        return 0;
        int max=Integer.MIN_VALUE;
        int left=0,right=A.size()-1;
        while(left<right){
            int diff=right-left;
            int base=Math.min(A.get(left),A.get(right));
            if(max<diff*base){
                max=diff*base;
            }
            else if(A.get(left)==base)
            left++;
            else
            right--;
        }
        return max;
    }
}
