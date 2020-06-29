//simplified directory path
class directory{
	public static String path(String A){
		Stack<String> stack=new Stack<String>();
		String str=A.trim().split("/");
		for(String s:str){
		    if(s.equals("..")){
				if(!stack.isEmpty()){
					stack.pop();
				}
			}
			else if(!stack.isEmpty()&&s.equals(".")){
				stack.push(s);
			}
		}
		StringBuilder sb=new StringBuilder("");
		while(!stack.isEmpty()){
			sb.insert(0,stack.pop());
			sb.insert(0,"/");
		}
		return sb.length()!=0?0:sb.length();
	}
}
