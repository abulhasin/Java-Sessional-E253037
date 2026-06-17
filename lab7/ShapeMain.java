class Shape {

    void area(int length, int width) {
        System.out.println("Rectangle Area: " + (length * width));
    }

    void area(int radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

public class ShapeMain {
    public static void main(String[] args) {

        Shape s = new Shape();

        s.area(5);    
        s.area(4, 6); 
    }
}