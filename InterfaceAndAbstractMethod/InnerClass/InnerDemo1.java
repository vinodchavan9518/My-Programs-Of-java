package InterfaceAndAbstractMethod.InnerClass;


    class MYOuter 
{
	private int a=23;
	
	class MyInner
	{
		private int d=24;
		public void M1()
		{
			IO.println("Outer a is:"+a);
			IO.println("Inner d is:"+this.d);
		}
	}
}

public class InnerDemo1 {

	public static void main(String[] args) {
		MYOuter.MyInner mi=new MYOuter().new MyInner();
		mi.M1();

	}

}


