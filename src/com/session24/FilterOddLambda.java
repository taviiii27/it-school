package com.session24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddLambda {
    public static void main(String[] args) {
        FilterOddIntf oddFilter = list ->
                list.stream()
                        .filter(n -> n % 2 != 0)
                        .collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(oddFilter.filter(numbers));
    }
}
