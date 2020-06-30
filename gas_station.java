//gas station
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
        int start=0,tank=0,total=0;
        for(int i=0;i<A.size();i++){
            if((tank=tank+A.get(i)-B.get(i))<0){
                start=i+1;
                total+=tank;
                tank=0;
            }
        }
        return (total+tank)<0?-1:start;
    }
}
