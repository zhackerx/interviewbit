//redundant braces
public class Solution {
    public int braces(String A) {
        Stack<Character> st=new Stack<Character>();
        for(char c:A.toCharArray()){
            if(c==')')
            {
                char top=st.peek();
                st.pop();
                if(top=='(')return 1;
                else{
                    int count=0;
                    while(top!='('){
                        top=st.peek();
                        count++;
                        st.pop();
                    }
                    if(count==1)return 1;
                }
            }
            else{
                st.push(c);
            }
        }
        return 0;
    }
}
