package chapter2.item1;

import java.util.function.Supplier;

public class ExpensiveResource {
    private ExpensiveResource() {
        System.out.println("ExpensiveResource created");
    }

    public static Supplier<ExpensiveResource> getExpensiveResourceSupplier() {
        return ExpensiveResource::new;
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }

    public static void main(String[] args) {
        Supplier<ExpensiveResource> supplier = ExpensiveResource.getExpensiveResourceSupplier();
        System.out.println("Getting expensive resource...");
        ExpensiveResource expensiveResource = supplier.get();
        expensiveResource.doSomething();
    }
}
