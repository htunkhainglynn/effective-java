package chapter2.item5;

public class Service {

    private final Database database;

    public Service(Database database) {
        this.database = database;
    }

    public void connect() {
        database.connect();
    }

    public static void main(String[] args) {
        Service service = new Service(new Postgres());
        service.connect();

        service = new Service(new Oracle());
        service.connect();
    }
}
