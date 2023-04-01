package decision_making_statements;

public class j_04_nested_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per = 90;

		if (per > 50) {
			if (per > 60) {
				System.out.println("passed");
			} else {
				System.out.println("just passed");
			}

		} else {
			System.out.println("failed");
		}
	}

}
