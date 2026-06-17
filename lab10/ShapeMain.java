package lab10;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 7;

    void area() {
        double result = 3.1416 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }

}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }

}

public class ShapeMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }

}