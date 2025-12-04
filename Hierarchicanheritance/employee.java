package Hierarchicanheritance;


    class Parent
{
	 private int x;
	 private int y;
	 
	 public void setData(int x,int y)
	 {
		 
		 this.x=x;
		 this.y=y;
	 }
	 public int getX()
	 {
		 return this.x;
	 }
	 public int getY()
	 {
		 return  this.y;
	 }
	 
}
class Child extends Parent
{
	public void showData() {
		System.out.println("x value is :"+this.getX());
		System.out.println("y value is :"+this.getY());
	}
}

public class employee {

	public static void main(String[] args) {
		 
		Child child = new Child();
		child.setData(100,200);
		child.showData();
		

	}

}

    

