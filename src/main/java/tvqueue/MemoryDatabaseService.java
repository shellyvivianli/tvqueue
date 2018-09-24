package tvqueue;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemoryDatabaseService {

    private Map<Long, Greeting> greetings = new HashMap<>();
    private Map<Integer, User> users = new HashMap<>();

    public void addGreeting(Greeting greeting) {
        greetings.put(greeting.getId(), greeting);
    }

    public Greeting getGreeting(long id) {
        if (greetings.containsKey(id))
        {
            return greetings.get(id);
        }
        return null;
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(int id) {
        return users.get(id);
    }
}
