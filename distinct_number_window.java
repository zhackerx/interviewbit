//distinct number in window
public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int k) {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>(); 
        for (int i = 0; i < k; i++) 
            hM.put(A.get(i), hM.getOrDefault(A.get(i), 0) + 1); 
        ArrayList<Integer> al=new ArrayList<>();
        al.add(hM.size());
        for (int i = k; i < A.size(); i++) { 
            if (hM.get(A.get(i-k)) == 1) { 
                hM.remove(A.get(i-k)); 
            } 
            else
                hM.put(A.get(i-k),hM.get(A.get(i-k)) - 1);  
            hM.put(A.get(i), hM.getOrDefault(A.get(i), 0) + 1); 
            al.add(hM.size()); 
        }
        return al;
    }
}
