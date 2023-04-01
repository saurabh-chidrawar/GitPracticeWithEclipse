package j_69_oops_interface;
interface drawable{
	void draw();
}

class rectangle implements drawable{
	public void draw() {
		System.out.println("this is rectangle");
	}
}

class circle implements drawable{
	public void draw() {
		System.out.println("this is circle");
		
	}
}


public class me_02_interface_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle r=new rectangle();
		r.draw();
		
		circle c=new circle();
		c.draw();

	}

}
