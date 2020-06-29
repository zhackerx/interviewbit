//String concat
class A{
	public static ArrayList<Integer> concat(String A,List<String> B){
		if(B.size()==0||A.length())
			return new ArrayList<String>();
		ArrayList<String> c=new ArrayList<>();
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0,j=B.size()*(B.get(0).length());j<=A.length();i++,j++){
			for(int k=i;k<j;k=k+B.get(0).length()){
				if(!c.contains(A.substring(k,k+B.get(0).length()))){
					break;
				}
				else{
					c.remove(A.substring(k,k+B.get(0).length));
				}
			}
			if(c.isEmpty()){
				ans.add(i);
			}
			c.clear();
			c.addAll(B);
		}
		return ans;
	}
}