package j_70_oops_abstraction;

abstract class bike{
	abstract void run();
}

class me_01_abstract_class extends bike {
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println(" this is run method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj=new me_01_abstract_class();
		obj.run();
	}

	

}
