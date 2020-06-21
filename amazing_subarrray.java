//Amazing subarrays which starts with vowels
public class Solution {
    public int solve(String A) {
        int co=0;
        for(int i=0;i<A.length();i++){
        char c=Character.toLowerCase(A.charAt(i));
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        co+=A.length()-i;
		}
        return co%10003;
    }
}
