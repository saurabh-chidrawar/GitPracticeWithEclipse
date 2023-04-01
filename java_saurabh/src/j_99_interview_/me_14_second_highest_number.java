package j_99_interview_;

public class me_14_second_highest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 456, 7657, 3454, 67567, 324 };

		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);

		}
		
		System.out.println("\n");
		System.out.println(arr[arr.length-2]);-- 

	}

}
