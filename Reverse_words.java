//Reverse_Words
public class Solution {
    public String reverseWords(String a) {
	    String[] arr = a.trim().split("\\s+");
		String s="";
	    for (int i=arr.length-1; i>0; i--) {
	        if (!arr[i].isEmpty()) {
	            s+=arr[i]+" ";
	        }
	    }
		s+=arr[0];
	    return s;
	}
}