package tvqueue;

public interface DatabaseService {
    void addGreeting(Greeting greeting);
    Greeting getGreeting(long id);
}
