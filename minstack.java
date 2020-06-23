//minimum stack
class Solution {
    Stack<Integer> stack=new Stack<Integer>();
    int min=Integer.MAX_VALUE;
    public void push(int x) {
        if(stack.isEmpty()||x<=min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        if(!stack.isEmpty()){
        if(min==stack.pop())
        min=stack.pop();
        }
    }

    public int top() {
        return stack.isEmpty()?-1:stack.peek();
    }

    public int getMin() {
        return stack.isEmpty()?-1:min;
    }
}
