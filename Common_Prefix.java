//program to find the longest common prefix
class Common_Prefix{
	public static String find_prefix(String []a){
		if(a==null||a.length==0)
			return "";
		String prev=a[0];
		int i=0;
		while(i<a.length){
			while(a[i].indexOf(prev)!=0)
				prev=prev.substring(0,prev.length()-1);
			i++;
		}
		return prev;
	}
}