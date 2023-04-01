package j_Extra_pattern;

public class j_04_right_space_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for (int i = a; i >= 0; i--) {

			for (int k = 0; k <= a - i; k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}

			System.out.println(" ");
		}

	}

}
