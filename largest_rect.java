//largest rectangle
public class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;int max=0;
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<=n;i++){
            int h=(i==n)?0:heights[i];
            if(s.empty()||h>=heights[s.peek()]){
                s.push(i);
            }
            else{
                int t=s.pop();
                max=Math.max(max,heights[t]*(s.empty()?i:i-s.peek()-1));
                i--;
            }
        }
        return max;
    }
}
