package LambdaExpression;

import java.util.function.Supplier;


    class Student
{ 
    private int id;
    private String name;
    private String gender;
    private int age;
 
    public Student(int id, String name, String gender, int age) 
	{
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
 
    @Override
    public String toString() 
		{
        return "[id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
        }
}
		
public class StudentDemo 

{
	public static void main(String[] args) 
	{
      Supplier<Student> stdSupplier = () -> new Student(1, "Virat", "Male", 24);
		
        Student std =  stdSupplier.get();
        System.out.println(std);       
	}
}



