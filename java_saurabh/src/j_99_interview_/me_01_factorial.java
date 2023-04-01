package j_99_interview_;

import java.util.Scanner;

public class me_01_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=i*fact;
			
		}
		System.out.println(fact);
	}

}
