package com.session22_23;

public class MainForSimpleCache {
    public static void main(String[] args) {
        SimpleCache<Song> cache = new SimpleCache<>();

        Song s1 = new Song("Despacito", "Luis Fonsi", 180);
        Song s2 = new Song("Believer", "Imagine Dragons", 210);

        cache.put(s1);
        cache.put(s2);

        System.out.println("Retrieved: " + cache.get(s1.hashCode()));
        System.out.println("Retrieved: " + cache.get(s2.hashCode()));
    }
}
