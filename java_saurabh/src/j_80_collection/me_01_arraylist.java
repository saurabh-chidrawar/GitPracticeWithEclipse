package j_80_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class me_01_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(4);
		a.add(8);

		Iterator itr = a.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(a.get(1));
		// sort array

		Collections.sort(a);
		System.out.println("-------------------------------------");

		for (int m : a) {
			System.out.println(m);

		}

		
	}

}
