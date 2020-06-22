//remove duplicates from sorted array
public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
       if (a.size() <= 1) return a.size();

	    int i = 1;
	    int j = 1;
	    boolean twice = false;

	    while (i<a.size()) {
	        if (!a.get(i).equals(a.get(i - 1))) {
	            a.set(j, a.get(i));
	            j++;
	            twice = false;
	        }
	        else {
	            if (!twice) {
	                a.set(j, a.get(i));
	                twice = true;
	                j++;
	            }
	        }
	        i++;
	    }

	    ArrayList<Integer> al = new ArrayList<>();
	    i = 0;
	    while (i<j) {
	        al.add(a.get(i++));
        }

        a.clear();
	    for (int num : al) {
	        a.add(num);
        }

	    return a.size();
	}
}
