//distribute candies
public class Solution {
    public int candy(ArrayList<Integer> A) {
       int n = A.size();
      int[] res = new int[n];
      Arrays.fill(res, 1);
      for(int i = 1; i < n; i++){
        if(A.get(i) > A.get(i-1)){
          res[i] = res[i - 1] + 1;            
        }  
      }    
      
      for(int i = n - 1; i > 0; i--){
        if(A.get(i-1) > A.get(i)){
          res[i - 1] = Math.max(res[i] + 1, res[i - 1]);    
        }
      }
      
      int sum = 0;
      for(int r: res) sum += r;
      
      return sum;
    }
}
