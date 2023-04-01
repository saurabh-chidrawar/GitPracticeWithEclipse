package j_80_collection;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ne_06_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> t=new TreeSet<String>();
		
		t.add("jay");
		t.add("vinay");
		t.add("amit");
		t.add("jay");
		
		java.util.Iterator<String> itr=t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
