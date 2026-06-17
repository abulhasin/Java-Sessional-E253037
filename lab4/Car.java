public class Car {
    String brand;
    String model;
    double price;
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", 20000);
        c1.displayCar();
    }
}
