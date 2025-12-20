package LambdaExpression.Predefined;


    

import java.util.function.Predicate;


record Student(Integer id,String name,Double marks)
{
	public String toString()
	{
		return ""+id+": "+name+" : "+marks;
	}
}


public class PredicateDemo4 {

	public static void main(String[] args) {
		
		Predicate<Student>p4=student -> student.marks()>=80;
		
		Student s1=new Student(123,"vinod",90d);
		
		if(p4.test(s1))
		{
			System.out.println(s1+"=>PASS");
		}
		else
		{
			System.out.println(s1+"=>FAIL");
		}
		
		

	}

}

    

