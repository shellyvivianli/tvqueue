package tvqueue;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
    private static int idCounter;

    private int id;
    private String name;
    private ArrayList<TVShow> tvShows;

    User() { }

    User(String name) {
        this.id = idCounter;
        idCounter++;

        this.name = name;
        this.tvShows = new ArrayList<TVShow>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<TVShow> getTvShows() {return tvShows;}

    public void addTvShow(TVShow tvshow){
        tvShows.add(tvshow);

    }


}
