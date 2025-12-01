package com.session24;

public class JoiningLambda {
    public static void main(String[] args) {
        JoiningIntf joiner = (a, b) -> a + " " + b;

        System.out.println(joiner.join("Hello", "World"));
    }
}
