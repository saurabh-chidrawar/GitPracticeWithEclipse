package Exceptional_Handling;

public class j_3_nested_try_catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//inner try1
			try {
				int a=100/0;
				
			}
			catch(ArithmeticException a) {
				System.out.println(a);
			}
			
			//inner try2
			
			try {
				int arr[]=new int[5];
				arr[5]=10;
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			
			
		}
		catch(Exception e) {
			System.out.println("handled outer exception");
		}
	}

}
