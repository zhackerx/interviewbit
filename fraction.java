//fraction 
import java.util.*;
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb=new StringBuilder("");
        Map<Long,Integer> map=new HashMap<Long,Integer>();
        if(denominator==0)
            return "";
        if(numerator<0&&denominator>0||numerator>0&&denominator<0)
            sb.append("-");
        long num=Math.abs((long)numerator);
        long deno=Math.abs((long)denominator);
        long n=num/deno;
        long rem=num%deno;
        sb.append(n);
        if(rem==0)
            return sb.toString();
        else
        sb.append(".");
        while(!map.containsKey(rem)){
            map.put(rem,sb.length());
            n=rem*10/deno;
            rem=rem*10%deno;
            if(rem!=0||rem==0&&!map.containsKey(rem))
                sb.append(n);
        }
        if(rem!=0){
            sb.insert(map.get(rem),"(");
            sb.append(")");
        }
        return sb.toString();
    }
}