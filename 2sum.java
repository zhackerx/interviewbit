//2 sum
class A{
	public static ArrayList<Integer> two_sum(ArrayList<Integer> A,int B){
		Map<Integer,Integer> map=new HashMap<>();
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<A.size();i++){
			if(map.containsKey(B-A.get(i)){
				ans.add(map.get(B-A.get(i))+1);
				ans.add(i+1);
				break;
			}
			else if(!map.containsKey(A.get(i)){
				map.put(A.get(i),i);
			}
		}
		return ans;
	}
}
				