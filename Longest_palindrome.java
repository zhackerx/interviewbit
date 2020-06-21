//Longest Palindrome Subarray
class Longest_palindrome{
	public String longpal(String s){
		int start=0,end=0;
		for(int i=0;i<s.length();i++){
			int len1=center(s,i,i);
			int len2=center(s,i,i+1);
			int len=Math.max(len1,len2);
			if(len>end-start+1){
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		return s.subtsring(start,end+1);
	}
	public int center(String s,int left,int right){
		if(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
		{
			left--;
			right++;
		}
		return right - left -1;
	}
}