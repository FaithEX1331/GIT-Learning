package learning.School.CLass_7;

interface Shape{
    double area();
    double perimeter();
}
class Circle implements Shape{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape{
    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
}

public class P2 {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(4,5);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}
