package tvqueue;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class GreetingController {

    @Autowired
    MemoryDatabaseService databaseService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="id") long id) {
        return databaseService.getGreeting(id);
    }

    @RequestMapping(value = "/greeting", method = POST)
    public ResponseEntity<Greeting> createGreeting(@RequestBody Greeting greetingRequest) {
        if (greetingRequest == null) {
            return null;
        }

        Greeting greeting = new Greeting(counter.incrementAndGet(), greetingRequest.getContent());
        databaseService.addGreeting(greeting);
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
