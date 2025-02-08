package chapter2.item2;

public class BuilderDemo {
    public static void main(String[] args) {
        Car car = new Car.Builder("Toyota", "Camry").build();
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
    }
}
