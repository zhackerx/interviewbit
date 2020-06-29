//largest histogram
class largest{
	public static int histo(int[] A){
		int n=A.length;
		int max=Integer.MIN_VALUE;
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<n;i++){
			int h=(i==n)?0:A[i];
			if(stack.empty()||h>=A[stack.peek()]){
				s.push();
			}
			else{
				int t=stack.pop();
				max=Math.max(max,A[t]*(stack.empty()?i:i-stack.peek()-1));
				i--;
			}
		}
		return max;
	}
}