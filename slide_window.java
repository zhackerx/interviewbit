//sliding window maximum
class sliding{
	public static int[] maximum(int[] a,int k){
	if(a==null||k<=0)
		return new int[0];
	int n=a.length;
	int r[]=new int[n-k+1];
	int ri=0;
	Deque<Integer> q=new ArrayDeque<>();
	for(int i=0;i<n;i++){
		while(!q.isEmpty()&&a[q.peek()]<i-k+1)
			q.poll();
		while(!q.isEmpty()&&a[q.peekLast()]<a[i])
			q.pollLast();
		q.offer(i);
		if(i>=k-1)
			r[ri++]=a[q.peek()];
	}
	return r;
	}
}