package Collection_Framerwork.List_Collection;

import java.util.Vector;









record Manager(Integer id,String name,Double salary)
{

}
public class VectorMangerDemo {
    public static void main(String[] args) {
		
		Vector<Manager>listOfManagers=new Vector<>();
		listOfManagers.add(new  Manager(333,"vinod",1234d));
		listOfManagers.add(new  Manager(222,"vin",234d));
		listOfManagers.add(new  Manager(666,"allen",9234d));
		listOfManagers.add(new  Manager(444,"scott",834d));
		listOfManagers.add(new  Manager(999,"den",2234d));
		listOfManagers.add(new  Manager(888,"alem",4234d));
		listOfManagers.add(new  Manager(111,"marsc",6234d));

		
		for(Manager manager:listOfManagers)
		{
			if(manager.id()==444)
			{
				listOfManagers.remove(manager);
				break;
			}
		}
		listOfManagers.forEach(System.out::println);
		
	}

}


