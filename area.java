import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        
        System.out.println("Enter the radius:");
        int Radius = ab.nextInt();
        
        System.out.println("Enter the Length of the Rectangle:");
        int Length = ab.nextInt();
        
        System.out.println("Enter the Breadth of the Rectangle:");
        int Breadth = ab.nextInt();
        
        System.out.println("Enter the side of the square:");
        int Side = ab.nextInt();
        
        System.out.println("Enter the Base of the triangle:");
        int Base = ab.nextInt();
        
        System.out.println("Enter the Perpendicular of the triangle:");
        int Perpendicular = ab.nextInt();
        
        double circle = Math.PI * Radius * Radius;
        int square = Side * Side;
        int rectangle = Length * Breadth;
        double triangle = 0.5 * Base * Perpendicular;
        
        System.out.println("The Area of the circle is: " + circle);
        System.out.println("The Area of the square is: " + square);
        System.out.println("The Area of the rectangle is: " + rectangle);
        System.out.println("The Area of the triangle is: " + triangle);
        
  
    }
}