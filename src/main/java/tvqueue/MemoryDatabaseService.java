package tvqueue;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemoryDatabaseService implements DatabaseService {

    private Map<Long, Greeting> greetings = new HashMap<>();

    @Override
    public void addGreeting(Greeting greeting) {
        greetings.put(greeting.getId(), greeting);
    }

    @Override
    public Greeting getGreeting(long id) {
        if (greetings.containsKey(id))
        {
            return greetings.get(id);
        }
        return null;
    }
}
