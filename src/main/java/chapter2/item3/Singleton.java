package chapter2.item3;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // private constructor
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
