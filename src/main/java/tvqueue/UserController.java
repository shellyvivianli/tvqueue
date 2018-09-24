package tvqueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    MemoryDatabaseService database;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public User getSomeUser() {
        return database.getUser(0);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public User createUser(@RequestBody User input) {
        String name = input.getName();
        User newUser = new User(name);
        database.addUser(newUser);
        return newUser;
    }

    @RequestMapping(value = "/users/{idString}/tvshows", method = RequestMethod.POST)
    public User addTVShow(@PathVariable("idString") String idString, @RequestBody TVShow input) {
        int userID = Integer.parseInt(idString);
        User user = database.getUser(userID);
        String name = input.getName();
        int numberOfEpisodes = input.getNumberOfEpisodes();
        int episodeUserWatched = input.getEpisodeUserWatched();
        TVShow newTVShow = new TVShow(name, numberOfEpisodes, episodeUserWatched);
        user.addTvShow(newTVShow);
        database.addUser(user);
        return user;

    }
}
