package j_5_String;

public class me_02_toggle_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HGhsdHKghgJ";
		String str1 = " ";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				str1 = str1 + Character.toLowerCase(str.charAt(i));
			}
			else {
				str1=str1+Character.toUpperCase(str.charAt(i));
				
			}
				
		}
		System.out.println(str1);
	}

}
