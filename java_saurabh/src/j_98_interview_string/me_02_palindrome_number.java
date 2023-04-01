package j_98_interview_string;

import java.util.Scanner;

public class me_02_palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String pali = str;
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			str2 = str.charAt(i) + str2;

		}
		System.out.println(str2);
		if (pali.equals(str2)) {
			System.out.println("pali");
		} else {
			System.out.println("not pali");
		}
	}

}
