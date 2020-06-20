//program to find rank of permutation of given string
class rank_of_permutation{
	static int M=1000003;
	int fact[];
	public void fill_factorials(int num){
		fact[]=new int[num+1];
		fact[0]=1;
		for(int i=1;i<num+1;i++){
			fact[i]=(i*fact[i-1])%M;
		}
	}
	public int find_rank(String a){
		int n=a.length();
		fill_factorials(n);
		int count[]=new int[256];
		for(int i=0;i<n;i++)
			count[(byte)a.charAt(i)]++;
		int res=1;
		for(int i=1;i<n;i++){
			int flag=0;
			for(int j=0;j<(byte)a.charAt(i);j++){
				flag+=count[j];
			}
			res+=(fact[n-i-1]*flag)%M;
			count[(byte)a.charAt(i)]=0;
		}
		return res%M;
	}
}