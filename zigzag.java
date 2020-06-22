//Conversion of string zigzag according to number of rows
class zigzag{
	public static String zigzag_conversion(String A,int B){
		if(B<=1)
			return A;
		StringBuilder sb[]=new StringBuilder[B];
		for(int i=0;i<B;i++)
			sb[i]=new StringBuilder("");
		int increment=1,index=0;
		for(int i=0;i<A.length();i++){
			sb[index].append(A.charAt(i));
			if(index==0)increment=1;
			if(index==B-1)increment=-1;
			index+=increment;
		}
		String res="";
		for(int i=0;i<sb.length;i++)
			res+=sb[i];
		return res.toString();
	}
}