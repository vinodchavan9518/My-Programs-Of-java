package Collection_Framerwork.List_Collection;


    import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
//find various operations on Vector collection
public class VectorDemo1 {

	public static void main(String[] args) 
	{
		
		Vector<Integer>v=new Vector<>();
		
		int x[]= {22,20,10,40,15,58};
		
		for(int i=0;i<x.length;i++)
		{
			v.add(x[i]);
		}
		
		Collections.sort(v);//(old technique)
		
		v.sort((i1,i2)->i2-i1);//new Technique
		
		v.forEach(y->IO.println(y));
		
		IO.println(" MAximum element is :"+Collections.max(v));
		IO.println(" MAximum element is :"+Collections.min(v));
		IO.println(" Vector elemts:");
		
		v.forEach(y->IO.print(y));
		
		IO.println("====================");
		Collections.reverse(v);
		IO.println("After reverse ");
		v.forEach(y->IO.print(y));
		
		//How convert collection to array
		Object[]arry=v.toArray();
		IO.println(Arrays.toString(arry));

	}

}

    

