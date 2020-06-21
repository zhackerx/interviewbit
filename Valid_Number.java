//program to find valid number
class Valid_Number{
	public static int valid(String A){
		int digitscount=0;
		int decimalcount=0;
		int signcount=0;
		char c[]=A.toCharArray();
		for(int i=0;i<c.length;i++){
			if(Character.isDigit(c[i])){
				digitscount++;
				continue;
			}
			else if(ch[i]=='-'||ch[i]=='+'){
				signcount++;
				if(i==0)
					continue;
				else if(ch[i-1]!='e')
					return 0;
			}
			else if(ch[i]==' ')
				continue;
			else if(ch[i]=='.'){
				decimalcount++;
				if(decimalcount>1)
					return 0;
				if(i==c.length-1)
					return 0;
			}
			else if(ch[i]=='e'){
				if(i+2>=c.length)
					return 0;
				try{
					if(A.substring(i+1).indexOf('.')!=0)
						return 0;
					int num=Integer.parseInt(A.substring(i+1));
				}
				catch(Exception e)
				return 0;
			}
			else
				return 0;
		}
		return digitscount>0?1:0;
	}
}