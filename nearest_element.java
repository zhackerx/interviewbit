//Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.
public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<Integer>();
        for(int i:A){
            while(!st.isEmpty()&&st.peek()>=i)
            st.pop();
            if(st.isEmpty())
            al.add(-1);
            else
            al.add(st.peek());
            st.push(i);
        }
        return al;
    }
}
