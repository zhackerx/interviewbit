//difference possible
public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        if(A.size()==0)
        return 0;
        int n=A.size();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i&&j>=0;){
                if(A.get(j)-A.get(i)>B){
                    j--;
                }
                else if(A.get(j)-A.get(i)==B)
                return 1;
                else
                break;
                
            }
        }
        return 0;
    }
}
