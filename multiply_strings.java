//Multiply two Strings
public class Solution {
    public String multiply(String A, String B) {
        char cha[]=A.toCharArray();
        char chb[]=B.toCharArray();
        StringBuilder sb=new StringBuilder("");
        int res[]=new int[A.length()+B.length()];
        for(int i=cha.length-1;i>=0;i--){
            for(int j=chb.length-1;j>=0;j--){
                res[i+j+1]+=Character.getNumericValue(cha[i])*Character.getNumericValue(chb[j]);
                res[i+j]+=res[i+j+1]/10;
                res[i+j+1]%=10;
            }
        }
        for(int c:res){
            sb.append(c);
        }
        String ans=sb.toString().replaceFirst("^0*","");
        return ans.length()==0?"0":ans;
    }
}
