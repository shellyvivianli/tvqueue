package tvqueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    MemoryDatabaseService database;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public User getSomeUser() {
        return database.getUser(0);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public User createUser(@RequestBody User createUserRequest) {
        String name = createUserRequest.getName();
        User newUser = new User(name);
        database.addUser(newUser);
        return newUser;
    }
}
