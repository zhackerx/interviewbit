//Convert integer to roman
public class Solution {
    public String intToRoman(int A) {
        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String thousands=m[A/1000];
        String hundreds=c[(A%1000)/100];
        String tens=x[(A%100)/10];
        String ones=i[A%10];
        String ans=thousands+hundreds+tens+ones;
        return ans;
    }
}
