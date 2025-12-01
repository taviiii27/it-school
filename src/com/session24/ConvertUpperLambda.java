package com.session24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperLambda {
    public static void main(String[] args) {
        ConvertUpperInterface formatter = names ->
                names.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        List<String> input = Arrays.asList("tavi", "maria", "alex");
        System.out.println(formatter.toUppercase(input));
    }
}

