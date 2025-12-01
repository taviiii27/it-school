package com.session22_23;

public class MainForSong {
    public static void main(String[] args) {
        Song s1 = new Song("Derniere Danse", "Indila", 180);
        Song s2 = new Song("Stressed Out", "21 pilots", 250);

        System.out.println("does s1 equal s2? → " + s1.equals(s2));
    }
}
