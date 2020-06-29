//pallindrome partitioning
public class Solution {
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> list=new ArrayList<>();
        helper(list,new ArrayList<>(),a,0);
        return list;
    }
    void helper(ArrayList<ArrayList<String>> list,ArrayList<String> tmp,String a,int start){
        if(start==a.length()){
            list.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=start;i<a.length();i++){
            String s=a.substring(start,i+1);
            if(ispal(s)){
                tmp.add(s);
                helper(list,tmp,a,i+1);
                tmp.remove(tmp.size()-1);
            }
        }
    }
    boolean ispal(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
