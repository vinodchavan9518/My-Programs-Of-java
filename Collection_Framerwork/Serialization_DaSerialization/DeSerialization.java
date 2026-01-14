package Collection_Framerwork.Serialization_DaSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.AccessException;


record Employee(Integer id,String name,Double price){
    
}

public class DeSerialization {
    public static void main(String[] args) throws IOException
	{

   String filePath="D\\new\\Employee";
   
   var fln=new FileInputStream(filePath);
   var ois=new ObjectInputStream(fln);
   
try(fln;ois)
{
	while(true)
	{
		Employee employee=(Employee)ois.readObject();
		IO.print(employee);
	}
}
catch(AccessException e)
{
	IO.print("Enter of file has reached:"+e);
}
catch(ClassNotFoundException e)
{
	IO.print("End file has reached :"+e);
}
	}

}


