//count and say program
public class Solution_Count_Say {
    public String countAndSay(int A) {
        if(A==1)
        return "1";
        if(A==0)
        return "";
        String num=countAndSay(A-1);
        String out="";
        int c=1;
        for(int i=0;i<num.length();i++){
            if(i==num.length()-1)
            out+=Integer.toString(c)+num.charAt(i);
            else if(num.charAt(i)==num.charAt(i+1)){
                c++;
            }
            else
            {
                out+=Integer.toString(c)+num.charAt(i);
                c=1;
            }
        }
        return out;
    }
}
