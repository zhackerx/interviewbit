//magicians and choclates problem
import java.util.*;
public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int i:B){
            pq.add(i);
        }
        int mod=1000000007;
        long total=0;
        while(A-->0){
            int c=pq.poll();
            total+=c;
            total%=mod;
            pq.add(c/2);
        }
        return (int)total;
    }
}
