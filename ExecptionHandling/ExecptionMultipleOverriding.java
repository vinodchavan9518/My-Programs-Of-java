package ExecptionHandling;

public class ExecptionMultipleOverriding {
	public static void main(String[] args) {
		String str = IO.readln("Enter a class name : ");
	    ParentClass pr = new ChildClass();
	   try {
		pr.loadingClass(str);
		IO.println("Class "+str+" loaded successfully.");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	}
	

}
class ParentClass{
	
	public void loadingClass(String className) throws ClassNotFoundException {
		
		Class.forName(className);
	}
}
class ChildClass extends ParentClass{
	@Override
public void loadingClass(String className) throws ClassNotFoundException {
		
	try {
      if(className.isEmpty() || className == null) {
    	  throw new IllegalArgumentException();
      }
      else {
    	  super.loadingClass(className);
      }
	}
	catch (IllegalArgumentException e) {
		e.printStackTrace();
	}
	}


	}




