//program to find rank of permutation with duplicate characters
class rank_of_duplicate_character_permutation{
	public static int rank(String a){
		BigInteger rank=BigInteger.ONE;
		BigInteger suffix_perm_count=BigInteger.ONE;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=a.length()-1;i>=0;i--){
			char x=a.charAt(i);
			int xcount=map.containsKey(x)?map.get(x)+1:1;
			map.put(x,xcount);
			for(Map.Entry<Character,Integer> m:map.entrySet()){
				if(m.getKey()<x){
					rank=rank.add((suffix_perm_count.multiply(BigInteger.valueOf(m.getValue()))).divide(BigInteger.valueOf(xcount)));
				}
			}
			suffix_perm_count=suffix_perm_count.multiply(BigInteger.valueOf(a.length()-i)).divide(BigInteger.valueOf(xcount));
		}
		return rank.divide(BigInteger.valueOf(1000003)).intValue();
	}
}