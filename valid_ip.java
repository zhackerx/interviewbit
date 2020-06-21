//check for valid ip address
public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
		int n=s.length();
		ArrayList<String> al=new ArrayList<>();
		if(n>12)
			return al;
		for(int i=1,i<n-2;i++){
			for(int j=i+1;j<n-1&&j<i+4;j++){
				for(int k=j+1;k<n&&k<j+4;k++){
					String s1=s.substring(0,i);
					String s2=s.substring(i,j);
					String s3=s.substring(j,k);
					String s4=s.substring(k,n);
					if(isValid(s1)&&isValid(s2)&&isValid(s3)&&isValid(s4))
						al.add(s1+"."+s2+"."+s3+"."+s4);
				}
			}
		}
		return al;
	}
	public boolean isValid(String s1){
	if(s1==null||s1.length()<3||Integer.parseInt(s1)>255||s1.charAt(0)=='0'&&s1.length()>1)
		return false;
	return true;
	}
}
		