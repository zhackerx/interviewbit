//Permutation sequence
class PermSeq{
	public String seq(int n,int k){
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
			list.add(i);
		int fact[]=new int[n];
		fact[0]=1;
		for(int i=1;i<=n;i++)
			fact[i]=i*fact[i-1];
		StringBuilder sb=new StringBuilder("");
		k=k-1;
		for(int i=n;i>0;i--){
			int index=k/fact[i-1];
			k=k%fact[i-1];
			sb.append(list.get(index));
			list.remove(index);
		}
		return sb.toString();
	}
}
		