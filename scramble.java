//scramble words
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isScramble(final String A, final String B) {
        return isScramble1(A,B)==true?1:0;
    }
     public boolean isScramble1(String s1, String s2) {
         s1=s1.toLowerCase();
         s2=s2.toLowerCase();
        if(s1 == null || s2 == null) return false;
        if(s1.equals(s2)) return true;
        if(s1.length()!=s2.length()) return false;
        
        int[] letters = new int[26];
        int len = s1.length();
        for(int i = 0; i < len; i++){
            letters[s1.charAt(i)-'a']++;
            letters[s2.charAt(i)-'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(letters[i]!= 0) return false;
        }
        
        for(int i = 1; i < len; i++){
            if(isScramble1(s1.substring(0,i), s2.substring(0,i)) && isScramble1(s1.substring(i), s2.substring(i))) return true;
            if(isScramble1(s1.substring(0,i), s2.substring(len-i)) && isScramble1(s1.substring(i), s2.substring(0,len-i))) return true;
        }
        return false;
    }
}
