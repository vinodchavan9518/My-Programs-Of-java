package Inheritance;

class Father {
	
	public void house() {
		System.out.println("# bhk House");
	}
}
class Son extends Father
{
	public void cat() {
		System.out.println("Auto Car");
	}
}


public class FatherDemo {

	
	public static void main(String[] args) {
		
	Son s=new Son();
	s.cat();
	s.house();
	

	}

}
