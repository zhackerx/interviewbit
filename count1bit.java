//count number of 1 bit
public class Solution {
    public int numSetBits(long a) {
        String s=Long.toBinaryString(a);
        return s.length()-s.replaceAll("1","").length();
    }
}
