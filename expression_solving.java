//Evaluate expression
import java.util.*;
public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> st=new Stack<Integer>();
        int a,b;
        for(String s:A){
                if(s.equals("+")){
                    st.push(st.pop()+st.pop());
                }
                else if(s.equals("*")){
                    st.push(st.pop()*st.pop());
                }
                else if(s.equals("-")){
                    b=st.pop();
                    a=st.pop();
                    st.push(a-b);
                }
                else if(s.equals("/")){
                    b=st.pop();
                    a=st.pop();
                    st.push(a/b);
                }
                else
                st.push(Integer.parseInt(s));
            }
            
        return st.peek();
    }
}
