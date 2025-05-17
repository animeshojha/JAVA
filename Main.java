// Class
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Object
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive();  // Output: Car is driving...
    }
}
