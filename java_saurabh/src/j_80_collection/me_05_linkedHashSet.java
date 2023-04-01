package j_80_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class me_05_linkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> ll = new LinkedHashSet<Integer>();
		
		ll.add( 12);
		ll.add(89);
		ll.add(67);
		ll.add(67);
		
		Iterator<Integer> itr=ll.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ll.remove(67);
		System.out.println("-------------------------");
		Iterator<Integer> itr1=ll.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
