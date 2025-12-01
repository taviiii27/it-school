package com.session24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingLambda{
    public static void main(String[] args) {

        MappingIntf mapper = (list, func) ->
                list.stream()
                        .map(func::apply)
                        .collect(Collectors.toList());

        Function square = x -> x * x;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> squared = mapper.map(numbers, square);

        System.out.println(squared);
    }
}

