package LambdaExpression.Predefined;

import java.util.function.Consumer;


    record Student(Integer id,String name,String course)
{
	
}
public class StudentNotification {

	void main()
	{
		
		Integer str=Integer.parseInt(IO.readln("Enter number of students"));
		
		//int choice=Integer.parseInt(IO.readln());
		
		
		
	
		for(int i=1;i<=str;i++) {	
		Integer id=Integer.parseInt(IO.readln("Enter ID:"));
		String name=IO.readln("Enter Name:");
		String course=IO.readln("Enter Course:");
		

	
	Student st = new Student(id,name,course);
	Consumer<Student>student= student1->
	{
		IO.println("Hello "+name+" ! welcome to the "+course+"course.\n");
	};
	
	student.accept(st);
		}
		

	}
}


















}
