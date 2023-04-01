package j_80_collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class me_02_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(10);
		l.add(7);

		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(l);
		System.out.println("----------------------");
		Iterator i = l.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(l.get(1));
		l.remove(1);
	}

}
