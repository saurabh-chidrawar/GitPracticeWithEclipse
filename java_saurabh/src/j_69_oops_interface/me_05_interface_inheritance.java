package j_69_oops_interface;


interface printable{
	void print();
}


interface showable extends printable{
	void show();
}


class testinterface implements showable{
	public void print() {
		System.out.println("this is print");
	}
	public void show() {
		System.out.println("this is show");
	}
}



public class me_05_interface_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testinterface t=new testinterface();
		t.print();
		t.show();

	}

}
