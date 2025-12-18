package LambdaExpression;

import java.util.function.*;
public class CalculationLogical {
      void main() {
    	  int num = Integer.parseInt(IO.readln("Enter a number : "));
    	  IO.println("Sample number : "+num);
    	  Predicate<Integer> nui1 = number -> number % 2 == 0;   	  
    	  IO.println(num+" is a even "+testPredicate(num,num1));
    	 
    	  
          Predicate<Integer> num2 = number -> number > 10;    	  
    	  IO.println(num+" is a greater than 10 "+testPredicate(num,num2));
    	  
          Predicate<Integer> num3 = number -> 
          {
        	  int count = 0;
        	  for(int i = 1 ; i <= number ;i++)
        	  {
        		  count = 0;
        		  for(int j = 1 ; j <= number ; j++) 
        		  {
        			  if(i%j==0)
        			  {
        				  count++;
        			  }
        		  }
        	  }
        	  if(count == 2) 
        	  {
        		  return true;
        	  }
        	  else 
        	  {
        		  return false;
        	  }
          };    	  
          IO.println(num+" is a prime "+testPredicate(num,num3));   	 
      }

	  public static boolean testPredicate(int num,Predicate<Integer> result) 
	  {
		return result.test(num);
		
	  }
}

    
}
