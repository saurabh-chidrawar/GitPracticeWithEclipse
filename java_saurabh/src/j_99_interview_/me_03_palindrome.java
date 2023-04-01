package j_99_interview_;

import java.util.Scanner;

public class me_03_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int b=a;
		int i,j=0;
		
		while(b>0) {
			i=b%10;
			j=j*10+i;
			b=b/10;
			
		}
		
		if(a==j) {
			System.out.println("pali");
			
		}
		else {
			System.out.println("not pali");
		}
	}

}
