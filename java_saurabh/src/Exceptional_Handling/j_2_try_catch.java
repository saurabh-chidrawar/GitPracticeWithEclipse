package Exceptional_Handling;

public class j_2_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1,2,3,4,5,3};
			
			System.out.println(arr[10]);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
