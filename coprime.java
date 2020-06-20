//program to find largest coprime number in range A,B
class coprime{
	public int gcd(int x,int y){
		if(x==0)
			return y;
		return (Math.min(x,y),Math.max(x,y)%(Math.min(x,y)));
	}
	public int largest_co_prime(int a,int b){
		while(gcd(a,b)!=1){
			a=a/gcd(a,b);
		}
		return a;
	}
}