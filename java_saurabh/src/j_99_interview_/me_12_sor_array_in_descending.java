package j_99_interview_;

public class me_12_sor_array_in_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 56, 3, 6, 7, 2, 9 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp = 0;
			for (int j = 0; j < i; j++) {

				if (arr[i] >arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
