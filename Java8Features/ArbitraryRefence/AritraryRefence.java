package Java8Features.ArbitraryRefence;
//find the method reference for the following code
interface MyFunction<T,U,V,R>
{
	
	R myApple(T t,U u,V v);
}

public class AritraryRefence {

    void main()
	{
		//lambda
		MyFunction<Addition,String,String,Integer>myLambda=
				(add,str1,str2)->add.doSum(str1,str2);
				
				IO.println(myLambda.myApple(new Addition(),"100","200"));
				MyFunction<Addition,String,String,Integer>myRef=
						Addition::doSum;
				IO.println(myRef.myApple(new Addition(),"500","400"));
					
	}

}

class Addition
{
	public Integer doSum(String n1,String n2)
	{
		return Integer.parseInt(n2)+Integer.parseInt(n2);
	}
}
    

