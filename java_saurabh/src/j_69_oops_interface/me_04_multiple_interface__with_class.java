package j_69_oops_interface;

interface a{
	void print();
}

interface b{
	void show();
}

class c implements a,b{
	public void print() {
		System.out.println("hello");
	}
	public void show() {
		System.out.println("welcome");
	}
}

public class me_04_multiple_interface__with_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj=new c();
		obj.print();
		obj.show();
	}

}
