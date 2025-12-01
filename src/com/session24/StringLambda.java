package com.session24;

public class StringLambda {
    public static void main(String[] args) {

        StringInterf comp = (s1, s2) -> s1.length() - s2.length();

        System.out.println(comp.compare("apple", "car"));
    }
}

