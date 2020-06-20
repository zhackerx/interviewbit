//program to find unique grid paths
class Grid_Path{
	public static int uniquePath(int A,int B){
		return helper(A,B,0,0);
	}
	static int helper(int A,int B,int x,int y){
		if(x==A||y==B)return 0;
		if(x==A-1||x==B-1)return 1;
		return helper(A,B,x+1,y)+helper(A,B,x,y+1);
	}
}