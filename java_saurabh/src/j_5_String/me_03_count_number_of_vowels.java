package j_5_String;

public class me_03_count_number_of_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="johnthan";
		int count=0;
		for (char c:str.toCharArray()) {
			if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u' ) {
				count++;
			}
		}
		System.out.println(count);

	}

}
