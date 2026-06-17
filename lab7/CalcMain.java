class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalcMain {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Add two integers: " + c.add(4, 5));
        System.out.println("Add two decimal numbers: " + c.add(2.5, 3.5));
        System.out.println("Add three integers: " + c.add(1, 2, 3));
    }
}