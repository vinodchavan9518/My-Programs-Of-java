package IntracterAndAbstract.LooseCoupling;

import java.util.Scanner;

public class InterfaceStatic {
    public static void main(String[] args) {
	
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter first Number:");
		var num1=Integer.parseInt(sc.nextLine());
		System.out.println(" Enter Second Number:");
		var num2=Integer.parseInt(sc.nextLine());
		
		double sum=Calculate.doSum(num1,num2);
		System.out.println(" sum is:"+sum);
		
		double cube=Calculate.getCube(num1);
		System.out.println(" Cube is:"+cube);

	}

}



 class Calculate
{
	static double doSum(int x,int y)
	{
		return(x+y);
	}
	
	static double getCube(int num)
	{
		return (num*num*num);
	}
	

}
