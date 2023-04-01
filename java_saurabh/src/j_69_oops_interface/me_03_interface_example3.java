package j_69_oops_interface;

interface bank{
	float interest();
}

class sbi implements bank{
	public float interest() {
		return 7.01f;
	}
}

class pnb implements bank{
	public float interest() {
		return 6.9f;
	}
}


public class me_03_interface_example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pnb p=new pnb();
		System.out.println(p.interest());

	}

}
