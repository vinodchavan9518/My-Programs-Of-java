package Collection_Framerwork.Set_Collection;

import java.util.HashSet;
//find the size of hashset when we add duplicate string and stringbuilder objects
public class HanhsetDemo1 {
    public static void main(String[] args) {
        
        HashSet<String> h1=new HashSet<>();
		h1.add("Java");
		h1.add(new String("Java"));
		IO.println(h1.size());
		
		IO.println("+++++++++++++++++");
		HashSet<StringBuilder> hs1=new HashSet<>();
		hs1.add(new StringBuilder("java"));
		hs1.add(new StringBuilder("java"));
		hs1.add(new StringBuilder("C languan"));
		IO.println(hs1.size());
	}

    }
    

