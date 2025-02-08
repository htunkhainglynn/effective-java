package chapter2.item1.using.supplier;

public class Postgres implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to Postgres database...");
    }
}
