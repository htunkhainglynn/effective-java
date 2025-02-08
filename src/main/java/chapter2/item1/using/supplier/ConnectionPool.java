package chapter2.item1.using.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConnectionPool<T> {

    private final List<T> pool = new ArrayList<>();

    public ConnectionPool(int size, Supplier<? extends T> factory) {
        for (int i = 0; i < size; i++) {
            pool.add(factory.get());
        }
    }

    public List<T> getPool() {
        return pool;
    }
}
