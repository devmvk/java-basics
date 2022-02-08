package com.devmvk.music;

public class Song {
    private final String name;
    private final Integer durationInSeconds;

    public Song(String name, Integer durationInSeconds) {
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getName() {
        return name;
    }

    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }
}
