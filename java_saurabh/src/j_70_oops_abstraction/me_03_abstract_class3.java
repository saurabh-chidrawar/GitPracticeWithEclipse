package j_70_oops_abstraction;


abstract class bank{
	abstract int getInterest();
}

class sbi extends bank{
	int getInterest() {
		return 7;
	}

}

class pnb extends bank{
	int getInterest() {
		return 8;
	}
}

public class me_03_abstract_class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank b;
		b=new sbi();
		System.out.println(b.getInterest());
	}

}
