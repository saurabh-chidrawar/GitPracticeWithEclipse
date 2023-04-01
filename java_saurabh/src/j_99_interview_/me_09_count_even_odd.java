package j_99_interview_;

public class me_09_count_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even = 0,odd=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
		}
		System.out.print(even+"  "+odd);
	}

}
