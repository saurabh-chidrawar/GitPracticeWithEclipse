package j_80_collection;

import java.util.HashSet;
import java.util.Iterator;

public class me_04_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		h.add(1);
		h.add(2);
		h.add(9);
		h.add(2);
		
		Iterator itr=h.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
