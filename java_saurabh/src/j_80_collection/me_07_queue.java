package j_80_collection;

import java.util.Iterator;
import java.util.PriorityQueue;



public class me_07_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		
		p.add( 1);
		p.add(3);
		p.add(9);
		
		System.out.println(p.peek());
		System.out.println(p.size());
		System.out.println(p.remove(9));
		
		Iterator<Integer> itr=p.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
