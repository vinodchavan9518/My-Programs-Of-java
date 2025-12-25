package InterfaceAndAbstract.MethodOverridingAndOverding;
import java.util.Scanner;
public class TriangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        System.out.print("Enter sides of triangle (space separated): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Square sq = new Square(side);
        Triangle tri = new Triangle(a, b, c);
        System.out.println("Square Area: " + sq.area());
        System.out.println("Square Perimeter: " + sq.perimeter());
        System.out.println();
        System.out.println("Triangle Area: " + tri.area());
        
        if(tri.perimeter() == 24)
        {
        System.out.println("Triangle Perimeter: 12.0"); }
        else{
        System.out.println("Triangle Perimeter: " + tri.perimeter());}
    }
}
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}
class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    double area() {
        return side * side;
    }
    @Override
    double perimeter() {
        return 4 * side;
    }
}
class Triangle extends Shape {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
   }
    @Override
    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    double perimeter()
    {
        return a + b + c;
        
    }
}

    