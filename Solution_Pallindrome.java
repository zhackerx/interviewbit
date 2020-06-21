//Palindrome String
public class Solution_Pallindrome {
    public int isPalindrome(String A) {
        String s=A.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        if(s.equals(new StringBuffer(s).reverse().toString()))
        return 1;
        else
        return 0;
    }
}
