package j_99_interview_;

import java.util.Scanner;

public class me_10_fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a+"\n"+b);
		for(int i=0;i<n-2;i++) {
			
			
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
				

	}

}

