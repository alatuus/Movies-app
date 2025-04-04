package titles.model;

public class Series extends Titles {
    private int numOfSeasons;
    private int episodesPerSeason;
    private boolean activeAiring;
    int episodeLength;

    public Series(String title, int releaseYear, int length) {
        super(title, releaseYear, length);
    }

    public void showSpecificInfos(){
        System.out.println(this.getNumOfSeasons());
        System.out.println(this.getEpisodesPerSeason());
        if(this.activeAiring){
            System.out.println("Active airing");
        } else{
            System.out.println("Finished airing");
        }
    }

    public void setNumOfSeasons(int numOfSeasons) {
        this.numOfSeasons = numOfSeasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setActiveAiring(boolean activeAiring) {
        this.activeAiring = activeAiring;
    }

    public void setEpisodeLength(int episodeLength) {
        this.episodeLength = episodeLength;
    }

    public int getNumOfSeasons() {
        return numOfSeasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public boolean getIsActiveAiring() {
        return activeAiring;
    }

    public int getEpisodeLength() {
        return episodeLength;
    }

    @Override
    public String toString() {
        return "Series: " + this.getTitle() + " (" + this.getReleaseYear() + ")";
    }

}

