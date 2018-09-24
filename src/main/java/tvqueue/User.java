package tvqueue;

public class User {
    private static int idCounter;

    private int id;
    private String name;

    User() { }

    User(String name) {
        this.id = idCounter;
        idCounter++;

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
