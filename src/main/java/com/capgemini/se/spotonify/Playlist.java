package com.capgemini.se.spotonify;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Track> tracks;

    public Playlist() {
        this.tracks = new ArrayList<>();
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void add(Track track) {
        this.tracks.add(track);
    }
}
