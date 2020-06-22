//divide integers
public class Solution {
    public int divide(int dividend, int divisor) {
        //overflow condition
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        return (int)((int)dividend/(int)divisor);
    }
}
