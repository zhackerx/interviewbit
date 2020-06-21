//Length of Last Word
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        String s[]=A.split("\\s+");
        if(A==null||s.length==0)
        return 0;
        return s[s.length-1].length();
    }
}
