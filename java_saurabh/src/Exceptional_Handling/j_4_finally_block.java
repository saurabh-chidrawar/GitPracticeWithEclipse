package Exceptional_Handling;

public class j_4_finally_block {
	public static void main(String[] args) {
		try {
			int a=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic error");
		}
		finally {
			System.out.println("this is finally block");
		} 
	}
}
