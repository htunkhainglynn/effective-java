package chapter2.item5;

public class Oracle implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}
