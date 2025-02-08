package chapter2.item5;

public class Postgres implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to Postgres database...");
    }
}
