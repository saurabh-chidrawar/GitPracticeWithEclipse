package j_98_interview_string;

import java.util.Scanner;

public class me_03_count_character_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			count=0;
			for(int j=0;j<str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
				System.out.println(str.charAt(i) +" is occured " +count+" times" );
			}
		}
	}

}
