package tvqueue;

public class TVShow {
    private String name;
    private int numberOfEpisodes;
    private int episodeUserWatched;
    private int id;

    TVShow() { }

    TVShow(String name, int numberOfEpisodes, int episodeUserWatched) {

        this.name = name;
        this.numberOfEpisodes = numberOfEpisodes;
        this.episodeUserWatched = episodeUserWatched;


    }

    public String getName(){ return name; }
    public int getNumberOfEpisodes() { return numberOfEpisodes; }
    public int getEpisodeUserWatched() {return episodeUserWatched; }


}
