package j_99_interview_;

public class me_13_max_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,67,454,8721,190};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				temp=arr[i+1];
			}
			else {
				temp=arr[i];
			}
		}
		
		System.out.println(temp);
		
	}

}
