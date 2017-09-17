package com.capgemini.se.spotonify;

import java.util.ArrayList;
import java.util.List;

public class Spotonify {

    private List<Playlist> playlists;

    public Spotonify() {
        playlists = new ArrayList<>();
    }

    public Playlist createPlaylist() {
        Playlist playlist = new Playlist();
        playlists.add(playlist);
        return playlist;
    }

    public void printPlaylist(Playlist playlist) {
        List<Track> tracks = playlist.getTracks();

        for (int i = 0; i < tracks.size(); i++) {
            Track track = tracks.get(i);
            System.out.println(track.getTitle());
        }
    }

    public static void main(String[] args) {
        Spotonify spotOnify = new Spotonify();

        Playlist playlist = spotOnify.createPlaylist();

        Track track1 = new Track("Smack my bitch up", "Prodigy");
        Track track2 = new Track("Smack my dog up", "Prodigy");

        playlist.add(track1);
        playlist.add(track2);

        spotOnify.printPlaylist(playlist);

    }
}