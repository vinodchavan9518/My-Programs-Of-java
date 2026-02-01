package Map_Collections.WeakHashMap;

import java.util.WeakHashMap;

// Employee record with finalize method to indicate garbage collection

record Employee(Integer id,String name,Double salary)
{
	public void finalize()
	{
		IO.print("Employee object is eligible for GC");
	}
}


public class weakHashMap {
    public static void main(String[] args) throws InterruptedException
     {
        
	{
		Employee e1=new Employee(222, "scott", 12000d);
		
		WeakHashMap<Employee,String> map=new WeakHashMap<>();
		
		map.put(e1,"Hyderabad");
		IO.println(map);
		
		map=null;
		System.gc();
		Thread.sleep(5000);
		
		IO.println(map);
		
    }

    }
    
}
