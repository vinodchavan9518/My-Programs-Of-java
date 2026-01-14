package Collection_Framerwork.Serialization_DaSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class Student
{
	//version compatibility
	private static final long serialVersionUID=1L;
	private transient int id;
	 private String name;
	 private transient Long mobileNumber;
	 
	 
	 
	 public Student(int id, String name, Long mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
	 }



	 @Override
	 public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + "]";
	 }	 
	 
}

public class Serialization_DeSerializationDemo1 {
    
	public static void main(String[] args) throws IOException
	{
		var fout=new FileOutputStream("D:\\new\\Student.txt");
        var oos=new ObjectOutputStream(fout);

        
        //serialization
        try(fout;oos)
        {
        	oos.writeObject(new Student(1,"sctton",1234567890l));
        	
        	IO.print(" Object Stored");
        }
        catch(IOException e)
        {
        	e.getStackTrace();
        }
        
        
        //De- serialization
        var fin=new FileInputStream("D:\\new\\Student.txt");
        var ois=new ObjectInputStream(fin);
        
        try(fin;ois)
        {
        	Student student=(Student)ois.readObject();
        	IO.print(student);
        }
        catch(IOException e)
        {
        	IO.print(e.getStackTrace());
        }
        catch(ClassNotFoundException e)
        {
        	e.getStackTrace();
        }
        
	}

}


