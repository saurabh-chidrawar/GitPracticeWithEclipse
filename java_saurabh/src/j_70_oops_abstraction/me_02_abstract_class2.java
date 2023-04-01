package j_70_oops_abstraction;

abstract class shape{
	abstract void draw();
}

class rectangle extends shape{
	void draw() {
		System.out.println("this is rectangle");
	}
}

class square extends shape{
	void draw() {
		System.out.println("this is square");
	}
}


public class me_02_abstract_class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s;
		s=new rectangle();
		s.draw();
		
		s=new square();
		s.draw();
		

	}

}
