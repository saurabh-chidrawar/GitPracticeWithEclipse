package j_70_oops_abstraction;

abstract class bike1{
	bike1(){
		System.out.println("bike is created");
	}
	
	abstract void run() ;
	
	void gearchange() {
		System.out.println("gear changed");
	}
}

class Honda extends bike1{
	void run() {
		System.out.println("honda bike is running");
	}
}

 

public class me_04_abstract_class_with_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bike1 b;
		b=new Honda();
		b.run();
		b.gearchange();
	}

}
