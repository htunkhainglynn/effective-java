package chapter2.item1;

public class StaticMethodDemo {
    public static void main(String[] args) {
        Car car = Car.of("Toyota");
        System.out.println(car.getModel());

        Car car2 = Car.of("Honda");
        System.out.println(car2.getModel());
    }
}
