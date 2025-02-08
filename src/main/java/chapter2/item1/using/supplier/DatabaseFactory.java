package chapter2.item1.using.supplier;

import java.util.function.Supplier;

public class DatabaseFactory {

    public static Supplier<Database> getDatabase(String database) {
        if (database.equals("postgres")) {
            return Postgres::new;
        } else if (database.equals("oracle")) {
            return Oracle::new;
        }
        return null;
    }

    public static void main(String[] args) {
        Supplier<Database> postgres = DatabaseFactory.getDatabase("postgres");
        Supplier<Database> oracle = DatabaseFactory.getDatabase("oracle");

        ConnectionPool<Database> connectionPool = new ConnectionPool<>(10, postgres);
        connectionPool.getPool().forEach(Database::connect);

        connectionPool = new ConnectionPool<>(10, oracle);
        connectionPool.getPool().forEach(Database::connect);
    }
}
