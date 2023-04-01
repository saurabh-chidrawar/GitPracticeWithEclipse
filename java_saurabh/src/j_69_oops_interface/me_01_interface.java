package j_69_oops_interface;
interface bike{
	void run();
	
}
class apache implements bike{
	public void run() {
		System.out.println("this is apache class");
	}
}
public class me_01_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			apache a=new apache();
			a.run();
	}

}
