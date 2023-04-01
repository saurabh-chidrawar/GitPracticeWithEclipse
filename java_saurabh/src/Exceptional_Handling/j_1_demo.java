package Exceptional_Handling;

public class j_1_demo {
	public static void main(String[] args) {
		// arithmetic exception

		/*
		 * try { int a = 10 / 0;
		 * 
		 * } catch (ArithmeticException e) { System.out.println("arithmetic error"); }
		 */

		// null pointer exception
/*		try {
			String s = null;
			System.out.println(s.length());

		} catch (NullPointerException n) {
			System.out.println("this is null pointer exception");
		}
	*/
		//arayindex out of bound
		try {
			int a[]=new int[5];
			a[10]=10;
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
			
		}
	}
}
