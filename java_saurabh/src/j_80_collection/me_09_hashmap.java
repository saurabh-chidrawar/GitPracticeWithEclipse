package j_80_collection;

import java.util.HashMap;
import java.util.Map;

public class me_09_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		map.put(1, 100);
		map.put(2, 400);
		map.put(3, 900);
		
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		} 
	}

}
