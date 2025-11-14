package com.session22_23;

public class Song {
    private final String title;
    private final String artist;
    private final int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Song other)) return false;
        return title.equals(other.title) && artist.equals(other.artist);
    }

    @Override
    public int hashCode() {
        return title.hashCode() ^ artist.hashCode();
    }
}
