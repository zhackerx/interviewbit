//4sum
public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Set<ArrayList<Integer>> set=new HashSet<>();
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++){
            for(int j=i+1;j<A.size();j++){
                int k=j+1;
                int l=A.size()-1;
                while(k<l){
                    int sum=A.get(i)+A.get(j)+A.get(k)+A.get(l);
                    if(sum>B){
                        l--;
                    }
                    else if(sum<B){
                        k++;
                    }
                    else if(sum==B){
                        ArrayList<Integer> al=new ArrayList<>();
                        al.add(A.get(i));
                        al.add(A.get(j));
                        al.add(A.get(k));
                        al.add(A.get(l));
                        if(!set.contains(al)){
                            set.add(al);
                            list.add(al);
                        }
                        k++;
                        l--;
                    }
                }
            }
        }
        return list;
    }
}
