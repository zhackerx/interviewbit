//Good reviews
public class Solution {
    static class pair
    {
        int index;
        int rating;
        
        public pair(int index, int rating)
        {
            this.index = index;
            this.rating = rating;
        }
    }
    public int[] solve(String A, String[] B) {
        
        String good[] = A.split("_");
        HashSet<String> hs = new HashSet<>();
        for(String str: good)
            hs.add(str);
        ArrayList<pair> arr = new ArrayList<>();
        int i = 0;
        for(String str: B)
        {
            String hotel[] = str.split("_");
            int count = 0;
            for(String s: hotel)
            {
                if(hs.contains(s))
                    count++;
            }
            arr.add(new pair(i, count));
            i++;
        }
        Collections.sort(arr, new Comparator<pair>(){
            public int compare(pair p1, pair p2)
            {
                if(p1.rating == p2.rating)
                {
                    return p1.index - p2.index;
                }
                else
                    return p2.rating - p1.rating;
            }
        });
        int[] soln = new int[B.length]; 
        i = 0;
        for(pair p: arr)
            soln[i++] = p.index;
            
        return soln;
    }
}