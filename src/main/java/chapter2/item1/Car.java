package chapter2.item1;

public class Car {
    private final String model;

    private Car(String model) {
        this.model = model;
    }

    // improve user readability by providing a static factory method
    // encapsulate instantiation logic
    public static Car of(String model) {
        return new Car(model);
    }

    public String getModel() {
        return this.model;
    }
}
