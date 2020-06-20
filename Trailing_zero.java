//program to find trailing zeros in a factorial
class Trailing_zero{
	public static int count(int A){
		int count_zero=0;
		while(A>0){
			count_zero+=A/5;
			A/=5;
		}
		return count_zero;
	}
}
		