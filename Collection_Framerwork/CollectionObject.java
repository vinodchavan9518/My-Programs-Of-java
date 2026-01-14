package Collection_Framerwork;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class CollectionObject {
    

public static void main(String[] args)
{

          Vector<String> listOfCity = new Vector<>();

            listOfCity.add("Hyderabad");

            listOfCity.add ("Kolkata");

            listOfCity.add("Pune");

            listOfCity.add("Indore");

              listOfCity.add ("Mumbai");

           System.out.println("1) By using toString() method :"); 
          System.out.println(listOfCity.toString());

             System.out.println("2) By using Ordinary for loop :"); 
             for(int i=0; i<listOfCity.size();i++)
           {
              System.out.println(listOfCity.get(i));

           }



         System.out.println ("3) By using for-each loop :"); 
               for(String city: listOfCity)
{
                System.out.println(city);
}
                System.out.println("4) By using Enumeration interface :");

                   Enumeration<String> elements = listOfCity.elements();

                  while(elements.hasMoreElements())
{
                   System.out.println(elements.nextElement());
}

             System.out.println("5) By using Iterator interface : ");

                    Iterator<String> iterator = listOfCity.iterator();

                         while(iterator.hasNext())
                               {
                         System.out.println(iterator.next());
                        }
                  iterator.forEachRemaining(str -> System.out.println(str));

             
                  System.out.println("6) By using ListIterator interface :");

                ListIterator<String> listItr = listOfCity.listIterator();

                     
                
                System.out.println ("IN FORWARD DIRECTION");

            while(listItr.hasNext())
              {
             System.out.println(listItr.next());
                 }
             System.out.println ("IN BACKWARD DIRECTION"); 
              while(listItr.hasPrevious())
             {
                System.out.println(listItr.previous());
               }
              
             System.out.println("7) By using Spliterator interface :");

                Spliterator<String> spliterator = listOfCity.spliterator(); 
             spliterator.forEachRemaining(str-> System.out.println(str));

                 System.out.println("8) By using forEach() :");
            listOfCity.forEach(city -> System.out.println(city));

               System.out.println("9) By using using Method Method Reference :"); 
            listOfCity.forEach(System.out::println);

                System.out.println("10) By using stream() method method :"); 
                listOfCity.stream().forEach(System.out:: println);

                 System.out.println("11) By using parallelStream() method :");
              listOfCity.parallelStream().forEach(System.out::println);




}

}
