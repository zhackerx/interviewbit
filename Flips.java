//finding maximum series of 1s when B flips are allowed
class Flips{
	public ArrayList<Integer> doflip(ArrayList<Integer> A,int B){
		ArrayList<Integer> al=new ArrayList<Integer>();
		if(A.size()==0)
			return al;
		int ptr1=0,ptr2=0,maxleft=0,maxright=0,maxlen=0;
		while(ptr2<A.size()){
			if(A.get(ptr2)==1||(A.get(ptr2)==0&&B>0)){
				if(A.get(ptr2)==0)
					B--;
				if(maxlen<ptr2-ptr1+1){
					maxlen=ptr2-ptr1+1;
					maxleft=ptr1;
					maxright=ptr2;
				}
				ptr2++;
			}
			if(ptr2<A.size()&&A.get(ptr2)==0&&B<=0){
				while(ptr1<ptr2&&B<=0){
					if(A.get(ptr1)==0)
					B++;
				ptr1++;
				}
			}
			if(ptr1==ptr2&&B<=0&&ptr1<A.size()&&A.get(ptr1)==0)
			{
				ptr1++;
				ptr2++;
			}
		}
		for(int i=maxleft;i<=maxright;i++)
			al.add(i);
		return al;
	}
}