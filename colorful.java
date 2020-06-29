//colorful numbers
public class Solution {
    public int colorful(int A) {
        Set<Integer> set=new HashSet<Integer>();
        String s=String.valueOf(A);
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String str=s.substring(i,j);
                if(str.length()>0){
                    int mul=prod(Integer.parseInt(str));
                    if(set.contains(mul)){
                        return 0;
                    }
                    set.add(mul);
                }
            }
        }
        return 1;
    }
    static int prod(int s){
        int p=1;
        while(s>0){
            p*=s%10;
            s/=10;
        }
        return p;
    }
}
