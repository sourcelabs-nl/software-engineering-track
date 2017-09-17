package com.capgemini.se.spotonify;

public class Track {

    private String title;
    private String artistName;

    public Track(String title, String artistName) {
        this.title = title;
        this.artistName = artistName;
    }

    public String getTitle() {
        return title;
    }

    public String getArtistName() {
        return artistName;
    }


}
