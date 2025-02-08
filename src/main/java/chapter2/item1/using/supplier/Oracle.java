package chapter2.item1.using.supplier;

public class Oracle implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}
