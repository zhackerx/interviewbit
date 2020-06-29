//redundancy traces
class Redundancy{
	public static int braces(String A){
		Stack<Character> stack=new Stack<Character>();
		for(char c:A.toCharArray()){
			if(c=='('){
				char top=stack.peek();
				stack.pop();
				if(top==')')return 1;
				else{
					int count=0;
					while(top!=')'){
						top=stack.peek();
						count++;
						stack.pop();
					}
					if(count==0) return 1;
				}
			}
			else{
				stack.push(c);
			}
		}
		return 0;
	}
}

