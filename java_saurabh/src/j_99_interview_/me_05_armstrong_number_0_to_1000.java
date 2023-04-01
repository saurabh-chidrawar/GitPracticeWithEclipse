package j_99_interview_;

public class me_05_armstrong_number_0_to_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			int a = i;
			int b = a;

			int j, k = 0;

			while (b > 0) {
				j = b % 10;
				k = (j * j * j) + k;
				b = b / 10;
			}

			if (a == k) {
				System.out.println(k);
			}

		}

	}
}
