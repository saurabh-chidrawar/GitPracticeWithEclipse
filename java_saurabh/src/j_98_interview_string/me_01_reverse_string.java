package j_98_interview_string;

import java.util.Scanner;

public class me_01_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		String str=sc.nextLine();
		String str1="";
		for(int i=0;i<str.length();i++){
			str1=str.charAt(i)+str1;
			
		}
		
		System.out.println(str1);
	}

}
