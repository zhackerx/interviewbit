//anagrams
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Map<String,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<A.size();i++){
            String sorted=getsort(A.get(i));
            if(!map.containsKey(sorted)){
                ArrayList<Integer> al=new ArrayList<>();
                al.add(i+1);
                map.put(sorted,al);
            }
            else{
                ArrayList<Integer> temp=map.get(sorted);
                temp.add(i+1);
                map.put(sorted,temp);
            }
        }
        for(Map.Entry<String,ArrayList<Integer>> m:map.entrySet()){
            list.add(m.getValue());
        }
        return list;
    }
    public String getsort(String s){
        char c[]=s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }
}
