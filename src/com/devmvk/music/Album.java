package com.devmvk.music;

import java.util.LinkedList;

public class Album {

    private LinkedList<Song> songs;

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void setSongs(LinkedList<Song> songs) {
        this.songs = songs;
    }
}
