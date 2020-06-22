//minimum xor value
public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int minxor=Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            minxor=Math.min(minxor,A.get(i)^A.get(i+1));
        }
        return minxor;
    }
}
