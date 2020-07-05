//characters to be deleted to make strings anagram
class GfG
{
	public int remAnagrams(String str1,String str2)
        {
        int count1[] = new int[26];  
        int count2[] = new int[26]; 
  
        // count frequency of each character  
        // in first string 
        for (int i = 0; i < str1.length() ; i++) 
            count1[str1.charAt(i) -'a']++; 
      
        // count frequency of each character  
        // in second string 
        for (int i = 0; i < str2.length() ; i++) 
            count2[str2.charAt(i) -'a']++; 
  
        // traverse count arrays to find  
        // number of characters to be removed 
        int result = 0; 
        for (int i = 0; i < 26; i++) 
            result += Math.abs(count1[i] - 
                               count2[i]); 
        return result; 
        }
}