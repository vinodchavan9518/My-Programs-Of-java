package Collection_Framerwork.Serialization_DaSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization_DeSerialization {
    
	public static void main(String[] args) throws IOException
	{
		
		ArrayList<String>listOfIceCream =new ArrayList<>();
		
		listOfIceCream.add("VInos");
		listOfIceCream.add(" Stribarry");
		listOfIceCream.add(" butter sctti");
		
		
		
		//SREIALIZATION
		
		String  filePath="D:\\new\\IceCream.txt";
		
		var fos=new FileOutputStream(filePath);
		var oos=new ObjectOutputStream(fos);
		
		
		try(fos;oos)
		{
		
			oos.writeObject(listOfIceCream);
			IO.println("Date stored successfully");
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		//De-serialization
		
		
		var fose=new FileInputStream(filePath);
		var ois=new ObjectInputStream(fose);
		
		
		try(fose;ois)
		{
			@SuppressWarnings("unchecked")
			ArrayList<String>icecream=(ArrayList<String>) ois.readObject();
			
			IO.println(icecream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

}
