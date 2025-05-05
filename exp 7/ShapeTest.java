abstract class Shape {
    abstract void calculateArea();
}


class Rectangle extends Shape {
    double length;
    double width;

   
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea() method
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Circle extends Shape {
    double radius;


    Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea() method
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(5, 3);
        rect.calculateArea();

        Circle circle = new Circle(4);
        circle.calculateArea();
    }
}
