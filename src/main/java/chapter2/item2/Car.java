package chapter2.item2;

public class Car {

    private final String brand;
    private final String model;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
    }

    public static class Builder {
        private final String brand;
        private final String model;

        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
}
