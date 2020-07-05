//repeating sub sequence
public class Solution {
    public int anytwo(String A) {
        String B=A;
        int i=0,j=0,x=0,count=0;
        for(i=0;i<B.length();i++){
            j=x;
            while(j<A.length()){
                if(A.charAt(j)==B.charAt(i)&&i!=j){
                    x=++j;
                    count++;
                    break;
                }
                else
                j++;
            }
        }
        return count>=2?1:0;
    }
}