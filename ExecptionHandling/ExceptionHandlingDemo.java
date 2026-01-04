package ExecptionHandling;

public class ExceptionHandlingDemo {
     public static void main(String[] args) {
		
     	try {
    		int num1 = Integer.parseInt(args[0]);
    		int num2 = Integer.parseInt(IO.readln(args[1]));
    		
    		int z = num1/num2;
    		IO.println("Division of two number : "+z);
    	}
    	catch (NumberFormatException e) {
        		IO.println(e);
    	}
    	catch(ArithmeticException e) {
    		IO.println(e);
    	}
    	finally {
    		IO.println("Division operation completed.");
    		}
    	
    }
}


