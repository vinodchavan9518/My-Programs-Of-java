
    class Shadow {
	private int roll = 101;
	private String name = "Scott;";
	public static String course = "java";;
	
	public void accept (int roll)
	{
		String name =  "Raj";
		String course = "HTML";
		
		System.out.println("Roll numbber is :"+roll);
		System.out.println("Name  is :"+name);
		System.out.println("Coutse   is :"+course);
	}

	}

public  class VariableShadow
{
	public static void main(String[] args) {
		Shadow s1= new Shadow();
		s1.accept(999);
		
	}
}

}
