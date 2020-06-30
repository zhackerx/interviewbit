//bulbs 
public class Solution {
    public int bulbs(ArrayList<Integer> A) {
        if(A.size()==0)
        return 0;
        int c=0;
        if(A.get(0)==0)
        c++;
        for(int i=1;i<A.size();i++){
            if(A.get(i)!=A.get(i-1))
            c++;
        }
        return c;
    }
}
