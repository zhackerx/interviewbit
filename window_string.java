//Window String
public class Solution {
    public String minWindow(String A, String B) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:B.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count=map.size();
        int start=0,idx=0,startidx=-1,endidx=-1,minlen=Integer.MAX_VALUE;
        while(idx<A.length()){
            if(map.containsKey(A.charAt(idx))){
                map.put(A.charAt(idx),map.get(A.charAt(idx))-1);
                if(map.get(A.charAt(idx))==0)
                count--;
            }
            while(start<A.length()&&count==0){
                if(minlen>idx-start+1){
                    startidx=start;
                    endidx=idx+1;
                    minlen=idx-start+1;
                }
                if(map.containsKey(A.charAt(start))){
                    map.put(A.charAt(start),map.get(A.charAt(start))+1);
                    if(map.get(A.charAt(start))==1)
                    count++;
                }
                start++;
            }
            idx++;
        }
        return minlen==Integer.MAX_VALUE?"":A.substring(startidx,endidx);
    }
}
