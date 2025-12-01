package com.session24;

public class FirstNLambda {
    public static void main(String[] args) {

        FirstNInterface trimmer = (str, n) ->
                (n >= str.length()) ? str : str.substring(0, n);

        System.out.println(trimmer.trim("HelloWorld", 5));
        System.out.println(trimmer.trim("Hi", 5));
    }

}
