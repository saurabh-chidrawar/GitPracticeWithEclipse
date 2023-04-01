package j_98_interview_string;

import java.util.LinkedHashSet;
import java.util.Set;

public class me_04_remove_duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "coconut";

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));

		}
		StringBuffer sb = new StringBuffer();
		for (Character ch : set) {
			sb.append(ch);
		}
		System.out.println(sb);
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
