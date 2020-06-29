//letter combinations
public class Solution {
    public ArrayList<String> letterCombinations(String A) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        ArrayList<String> list=new ArrayList<String>();
        comb(list,map,A,new StringBuilder(),0);
        return list;
    }
    void comb(ArrayList<String> list,Map<Integer,String> map,String a,StringBuilder sb,int id){
        if(id>a.length())
        return;
        if(id==a.length()&&sb.length()==a.length())
        list.add(new StringBuilder(sb.toString()).toString());
        for(int i=id;i<a.length();i++){
            String m=map.get(Integer.valueOf(String.valueOf(a.charAt(i))));
            for(int j=0;j<m.length();j++){
                sb.append(m.charAt(j));
                comb(list,map,a,sb,i+1);
                sb.deleteCharAt(sb.length()-1);
            }
        }

    }
}
