package Map_Collections.HashCodeAndEquals;

public class HashCodeAndEquals1 {
    public static void main(String[] args) {
        
	 String s1="Vishal";
	 String s2=new String("Vishal");
	 
	 IO.println(s1==s2);//false
	 IO.println(s1.equals(s2));//true
	 IO.println(s1.hashCode());//1732361581
	 

	 IO.println(s2.hashCode());//-1732361581
 


    
        IO.println(s1.hashCode()==s2.hashCode());//true
    }
}