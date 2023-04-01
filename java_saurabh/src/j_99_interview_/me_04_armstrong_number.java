package j_99_interview_;

import java.util.Scanner;

public class me_04_armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int b = a;
		int i, j = 0;

		while (b > 0) {
			i = b % 10;
			j = (i * i * i) + j;
			b = b / 10;

		}
		if (a == j) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

}
