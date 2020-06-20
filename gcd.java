//program to find Gcd in Two lines
class gcd{
	public int GCD(int a,int b){
		if(b==0)
			return a;
		return GCD(Math.min(a,b),Math.max(a,b)%Math.min(a,b));
	}
}