package Collection_Framerwork.Set_Collection;

import java.util.ArrayList;
import java.util.TreeSet;
//find the natural order of StringBuffer and character using TreeSet
public class TreeSetStringBuffer {
    public static void main(String[] args) {

      {
		TreeSet<StringBuffer> ts1=new TreeSet<>();
		ts1.add(new StringBuffer("vinod"));
		ts1.add(new StringBuffer("Dshal"));
		ts1.add(new StringBuffer("Aike"));
		ts1.add(new StringBuffer("Bnod"));
		ts1.forEach(IO::println);
		
		
		TreeSet<StringBuffer> teBuffers=new TreeSet<>();
		teBuffers.add(new StringBuffer("H"));
		teBuffers.add(new StringBuffer("A"));
		teBuffers.add(new StringBuffer("C"));
	   teBuffers.forEach(IO::println);
	   
	   IO.println("Asending order ");
	   
	   IO.println("+=======================================================");
	   
	   TreeSet<Character>ch=new TreeSet<>();
	   ch.add('C');
	   ch.add('A');
	   ch.add('D');
	   ch.add('B');
	   ch.forEach(IO::println);
	   
	   TreeSet<Character>ch2=new TreeSet<>(ch);
	   IO.println(ch2);
	   
	   IO.println("+========================");
	   ArrayList<String> lisof=new ArrayList<>();
	   lisof.add("Hyd");
	   lisof.add("Hyd");
	   lisof.add("Pune");
	   lisof.add("Mubai");
	   lisof.add("Surat");
	   
	   TreeSet<String> cites=new TreeSet<>(lisof);
	   IO.println(cites);
	   
	}





    }
}
