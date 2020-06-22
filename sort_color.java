//Sort the array according to colors (use of trick)
public class Solution {
    public void sortColors(ArrayList<Integer> a) {
        Collections.sort(a);
        /*
        int ar[]=new int[3];
        for(int i:a)
        ar[i]++;
        for(int i=0;i<a.size();i++){
            if(ar[0]!=0){
                a.set(i,0);
                ar[0]--;
            }
            else if(ar[1]!=0){
                a.set(i,1);
                ar[1]--;
            }
            else{
                a.set(i,2);
                ar[2]--;
            }
        }*/
    }
}
