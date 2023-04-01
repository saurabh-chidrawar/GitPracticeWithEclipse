package j_99_interview_;

import java.util.Scanner;

public class me_06_print_count_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);
		  
		  int a=sc.nextInt();
		  int b=a;
		  int i=0;
		  int j=0;
		  
		  while(b>0) {
			  i=b%10;
			  j+=1;
			  b=b/10;
		  }
		  System.out.println(j);

	}

}
